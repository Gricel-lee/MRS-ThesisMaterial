package uoy.mrs.uoy.mrs.auxiliary.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.uma.jmetal.problem.integerproblem.impl.AbstractIntegerProblem;
import org.uma.jmetal.solution.integersolution.IntegerSolution;

import parser.ast.ModulesFile;
import prism.Prism;
import uoy.mrs.uoy.mrs.auxiliary.Constants;
import uoy.mrs.uoy.mrs.auxiliary.Timer;
import uoy.mrs.uoy.mrs.auxiliary.Utility;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.models.MDPModelA;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.models.MDPModelB;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.models.MDPModelC;
import uoy.mrs.uoy.mrs.error.KanoaErrorHandler;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.Allocation;
import uoy.mrs.uoy.mrs.types.impl.Permutation;

/**
 * For an example, check org.uma.jmetal.problem.multiobjective.zdt ZDT1;
 * 
 */
public class AllocationProblem extends AbstractIntegerProblem {
	
	
	private static final long serialVersionUID = 1L;
	
	
	Allocation a1; // save info about allocation
	
	ProblemSpecification p;
	
	Prism PRISM; // prism instance
	
	ModulesFile modulesFile; //modules from prism
	
	// counter for average times
	int countFeas = 0;
	int countTotal = 0;
	
	/** a) Constructor */
	public AllocationProblem(Allocation a, ProblemSpecification p) {
		setName("Allocation"+a.getNum());
		setNumberOfVariables(a.getNumRobots());
	    setNumberOfObjectives(p.getParameters().getNumObjectives());
	    //setNumberOfConstraints(1); // as JMetal not consider constraints to remove solutions but as a quality parameter (the less constraints violated the better), not considered here -- before: constraint meant permutation must be feasible
	    setVariableBounds(getLowerBounds(a), getUpperBounds(a));
		// set local variables
	    this.a1 = a; this.p = p;
	    this.PRISM = Constants.PRISM;
	}
	
	
	/**Upper bounds is an array of size = number of robots
	 * and numbers being the number of possible permutations
	 * of each robot's tasks.
	 * For example, for two robot with three tasks each:
	 * bounds = [3!,3!] = [6,6]
	 * . */
	public static  List<Integer> getUpperBounds(Allocation a) {
		ArrayList<Integer> bounds = new ArrayList<Integer>();
		for(String r:a.getRobotsList()) {
			int nTasks = a.getNumTaskPermutations(r);
			bounds.add(nTasks);
		}
		return (List<Integer>) bounds;
	}
	/**Lower bounds is an array of size = number of robots
	 * and 1's, as they start with permutation number 1. 
	 * For example, for two robot with three tasks each:
	 * = [1,1] */
	public List<Integer> getLowerBounds(Allocation a){
		return new ArrayList<Integer>(Collections.nCopies(a.getNumRobots(),1));
	}
	
	
	
	/** b) Evaluate() method. Method for evaluating any solution of class IntegerSolution.
	 *  Description from org.uma.jmetal.problem.Problem:
	 * 	This method receives a solution, evaluates it, and returns the evaluated solution.
	 *  Example: org.uma.jmetal.problem.multiobjective.zdt ZDT1
	 * @return  solution - updated solution with objective values
	 */
	@Override
	public IntegerSolution evaluate(IntegerSolution solution)  {
		// get genes as string
		String permutationString = getGenesString(solution);
		// get attributes
		double[] attr = getAttrib(p,a1,permutationString); //permutationString e.g., (5,3,1,2,58)

		// save to JMetal solution
		for(int i=0; i<attr.length ; i++) { solution.objectives()[i] = attr[i];}//System.out.println(solution.objectives()[i]);}
		//count feasible solutions
		if(attr[0]!= (double) Utility.infiniteInt ) {countFeas+=1;countTotal+=1;}//System.out.println("feasible");}
		else {countTotal+=1;}
		
		//get time
		long time = Timer.getTime_no_restart();
		System.out.println("Time to eval chromosome: "+ time + "ms");
		// add solution info in JMetal
		solution.attributes().put("perm", permutationString);
		solution.attributes().put("attr", p.getParameters().getListObjectiveStrings());
		solution.attributes().put("time", time);
		return solution;
	  }
	
	
	public static String getGenesString(IntegerSolution solution) {
		String genesStr = "(";
		for (int i = 0; i < solution.variables().size(); i++) {
			Integer s = solution.variables().get(i); //get gene value
			genesStr = genesStr + String.valueOf(s) + ",";}
		return genesStr.substring(0,genesStr.length()-1) + ")";
	}
	
	
	
	/** Get attributes for one combination (alloc,perm)
	 * @param geneString */
	public static double[] getAttrib(ProblemSpecification p, Allocation a1, String geneString) {
		// -- 1 Optimisation objectives
		HashMap<String, Double> objectiveValuesHashmap = new HashMap<String, Double>(); //initialise array {} (this could be size 1 to 3 depending on number of optimisation objectives declared in DSL)
		
		// -- check feasibility (i.e., all travelling paths exists, no constraint (tasks, time, min. success rate) is violated)
		Boolean feasible = true;
		
		//---------------------------------------
		//1.2 Permutation info */		
		HashMap<String, Integer> r_permNum = getrobots2PermutationNum(a1,p,geneString);
		HashMap<String, Permutation> r_permutationTasks = getPerm(p,a1,r_permNum);
		
		//==print==
		if(Constants.verbose) {
			System.out.println("alloc:"+ a1.getNum() + ", permutation:"+r_permNum.values()+", robots:"+r_permNum.keySet()); //e.g.: robots2PermNum[1, 1, 2, 2, 3628800]
		}
		
		//1.3 Optimisation objectives declared in DSL
		ArrayList<String> objectiveList = p.getParameters().getListObjectiveStrings();
				
		//---------------------------------------
		//2 check if all paths are feasible 
		feasible = checkPaths(r_permutationTasks,  r_permNum, a1); //must be declared in DSL or in config.prop ALLOW_PATH_DISTANCE_EUCLIDIAN = true
		if(!feasible) {
			saveViolationDatabase(r_permNum, a1.getNum(), "pathsDontExist",Timer.getTime_no_restart());
			return createInViolationList(p);
		}
		
		//---------------------------------------
		//3 check if task permutation is feasible due to idle and task constraints (model A must not return infinite=2147483647)
		
		/////
		//---NOTE: OVER~6min PRISM stops and the run stops. Check this section.---
		/////
		
		double idle = (double) MDPModelA.checkModelA(r_permutationTasks,p,a1,geneString,r_permNum);
		if(idle==2147483647) { //unfeasible -- infinity
			saveViolationDatabase(r_permNum, a1.getNum(), "noPlanSynthesised",Timer.getTime_no_restart());//due to time limit, task constraint or idling limit
			return createInViolationList(p);
		}
		if(idle==-999999){ // unfeasible -- prism could not run file
			saveViolationDatabase(r_permNum, a1.getNum(), "PRISMfailModelA",Timer.getTime_no_restart());
			return createInViolationList(p);
		}
		
		//---------------------------------------
		//4) get attrib/optimisation values array (this could be 1, 2 or 3 depending on objectives declared in DSL)
		for (int i = 0; i <objectiveList.size() ; i++) {
			//if(Constants.verbose) {System.out.println("Getting value of optimisation objective: "+ objectiveList.get(i));}
			// 4.1 idle
			if(objectiveList.get(i)=="minIdle") { //already computed, & feasible is this part is reached
				objectiveValuesHashmap.put(objectiveList.get(i), idle);}
			// 4.2 probability of success
			else if(objectiveList.get(i)=="maxSucc") {
				double prob = MDPModelB.createModelB(r_permutationTasks,p,a1, geneString); //computed prob. of succ.
				objectiveValuesHashmap.put(objectiveList.get(i), (prob*100) );}
			// 4.3 travelling cost
			else if(objectiveList.get(i)=="minTravel") {
				double travelCost = MDPModelC.createModelC(r_permutationTasks);
				objectiveValuesHashmap.put(objectiveList.get(i), travelCost);}
			// ERROR
			else {KanoaErrorHandler.ErrorObjectiveNotRecognised(objectiveList.get(i));}
		}
		
		// print
		if(Constants.verbose){System.out.println("\n"+objectiveValuesHashmap.toString());}
		
		
		//---------------------------------------
		//5) check violation prob. success - if constraint declared in DSL then !=-1
		double succRate = 0;
		double succBound = p.getParameters().ratesucc;		
		
		if(succBound!=-1 && !objectiveList.contains("maxSucc")) //if prob. NOT computed yet
			succRate = MDPModelB.createModelB(r_permutationTasks,p,a1,geneString)*100;
		else succRate = objectiveValuesHashmap.get("maxSucc");
		//5.2 check if requirement holds (succ.rate has to be greater that N in the DSL)
		if(succBound!=-1 && succRate < succBound) { //if prob. bound declared and not fulfilled
			System.out.println("  Success rate not met");
			saveViolationDatabase(r_permNum, a1.getNum(), "probSuccessViolated",Timer.getTime_no_restart());//due to time limit, task constraint or idling limit
			return createInViolationList(p);}
		
		//---------------------------------------
		//6) feasible solution
		System.out.println("  Plan is feasible!");
		
		//save
		saveFeasibleDatabase(r_permNum, a1.getNum(), objectiveValuesHashmap,Timer.getTime_no_restart());
		
		
		//-------------------------------------
		//7) Convert Max success rate to Min success rate
		Double failRate = objectiveValuesHashmap.get("maxSucc");
		if(objectiveList.contains("maxSucc")) {objectiveValuesHashmap.put("maxSucc",100-failRate);} //called maxSucc but contains failRate for minimisation opt. problem in JMetal
		
		return createFeasibleValuesList(objectiveValuesHashmap, p);
	}
	
	
	
	
	private static void saveViolationDatabase(HashMap<String, Integer> r_permNum, String allocNum, String violationType, long time) {
		//String header3 = "alloc,,robots,,perm,,reason\n";
		String s = allocNum+",,"
				+ r_permNum.keySet()+",,"
				+ r_permNum.values() +",,"
				+ violationType  +",,"
				+ time ;
		Utility.WriteToFile(Constants.db3_infeaibleSolutions, s); //database 3
	}
	
	private static void saveFeasibleDatabase(HashMap<String, Integer> r_permNum, String allocNum, HashMap<String, Double> objectiveVal, long time) {
		//String header3 = "alloc,,robots,,permut,,attr,,time";
		
		String s = allocNum+",,"
				+ r_permNum.keySet()+",,"
				+ r_permNum.values() +",,"
				+ objectiveVal  +",,"
				+ time ;
		Utility.WriteToFile(Constants.db2_feasibleSolutions, s); //database 3
	}
	
	public static void saveGAOptimalDatabase(String anum, ArrayList<String> rob, Object perm, HashMap<String, Double> attr,
			Object time) {
		//String header3 = "alloc,,robots,,permut,,attr,,attrVal,,time";
		String s = anum+",," + rob+",," + perm +",," + attr +",," + time;
		Utility.WriteToFile(Constants.db1_optimisedSolutions, s); //database 1
	}
	
	private static double[] createFeasibleValuesList(HashMap<String, Double> objectiveValuesHashmap, ProblemSpecification p) {
		
		ArrayList<Double> optimisationValues = new ArrayList<Double>();
		for(int i=0; i<p.getParameters().getListObjectiveStrings().size();i++) {
			Double val = objectiveValuesHashmap.get(p.getParameters().getListObjectiveStrings().get(i));
			optimisationValues.add(val); //values of idle, succRate and travelCost
		}
		return Utility.arrayDouble2doubleList( optimisationValues);
	}
	
	/** Return array with the size of optimisation objectives 
	 * populated with 'infinite', i.e., infeasible  
	 * **/
	private static double[] createInViolationList(ProblemSpecification p){
		ArrayList<Integer> optimisationValues = new ArrayList<Integer>();
		for(int i=0; i<p.getParameters().getListObjectiveStrings().size();i++) 
			optimisationValues.add( Utility.infiniteInt ); //set to infinite as the optimisation problem in JMetal is a minimisation problem.
		
		
		return Utility.arrayInt2doubleList( optimisationValues );
	}
	
	
	/**Return true if feasible to travel between locations*/
	public static Boolean checkPaths(HashMap<String, Permutation> r_permutationTasks, HashMap<String, Integer> r_permNum, Allocation a1) {
		for(Permutation perm:r_permutationTasks.values()) {
			// not feasible - save in database 3 and return false
			if(!perm.isFeasible_AllPathsExist) {
				//KanoaErrorHandler.NoPathExistsToCompleteRunTestPermutation(r_permNum,perm,a1);
				return false;
			}
		}
		return true;
	}
	
	/*Array permutation of tasks*/
	private static HashMap<String, Permutation> getPerm(ProblemSpecification p, Allocation a,
			HashMap<String, Integer> robots2PermNum) {
		
		HashMap<String, Permutation> r_permutationTasks = new HashMap<>();
		// robots
		ArrayList<String> robIDset = a.getRobotsList();
		// 
		for (int i = 0; i < robIDset.size(); i++) {
			String rID = robIDset.get(i);
			Integer numPerm = robots2PermNum.get(rID);
			
			//System.out.println("robots2PermNum"+robots2PermNum.keySet()); //e.g. robots2PermNum[r2, r3, r4, r5, r1]
			//System.out.println("robots2PermNum"+robots2PermNum.values()); //     robots2PermNum[1, 1, 2, 2, 3628800]
			
			// permutation per robot
			Permutation perm = new Permutation(rID, p, a, numPerm);
			
			r_permutationTasks.put(rID, perm);
		}
		return r_permutationTasks;
	}
	
	/** <allocation,permutation> as a HashMap <robotID,numOfPermutation>*/
	private static HashMap<String, Integer> getrobots2PermutationNum(Allocation a1, ProblemSpecification p,String geneString) {
		HashMap<String, Integer> robots2PermNum = new HashMap<String, Integer>();
		
		//e.g. geneString= "(2,2,479001600)" -> "2,2,479001600"
		geneString=Utility.removeFirstChars(geneString,1);
		geneString=Utility.removeLastChar(geneString);
		//split
		String[] l = geneString.split(",");
		for (int i = 0; i < l.length; i++) {
			int gene = Utility.string2int(l[i]);
			String robotID = a1.getRobotsList().get(i);
			robots2PermNum.put(robotID , gene);
		}
		return robots2PermNum;
	}

}
