package uoy.mrs.uoy.mrs.auxiliary.scheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAII;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAIIBuilder;
import org.uma.jmetal.example.AlgorithmRunner;
import org.uma.jmetal.operator.crossover.CrossoverOperator;
import org.uma.jmetal.operator.crossover.impl.IntegerSBXCrossover;
import org.uma.jmetal.operator.mutation.MutationOperator;
import org.uma.jmetal.operator.mutation.impl.IntegerPolynomialMutation;
import org.uma.jmetal.operator.selection.SelectionOperator;
import org.uma.jmetal.operator.selection.impl.BinaryTournamentSelection;
import org.uma.jmetal.solution.integersolution.IntegerSolution;
import org.uma.jmetal.util.AbstractAlgorithmRunner;

import uoy.mrs.uoy.mrs.auxiliary.Constants;
import uoy.mrs.uoy.mrs.auxiliary.Timer;
import uoy.mrs.uoy.mrs.auxiliary.Utility;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.Allocation;
import uoy.mrs.uoy.mrs.types.impl.ScheduleGA;

public class Scheduler extends AbstractAlgorithmRunner{
	
	private static int countSol_id = 0;
	
	
	public static void run(ProblemSpecification p) {
		System.out.println(""+ p.getParameters().getNumObjectives()+" objectives:"+p.getParameters().getListObjectiveStrings());
		
		// -- new databases
		startDatabases();
		
	    // -- run
		for (Allocation a: p.getAllocations()) {
			System.out.println("\n-Task schedules for Allocation "+a.getNum() +" with " + a.getGroupsOfRobot().size() +" clusters." );
			runGA(a,p);
		}
	}
	
	
	
	/*
	 * Create new databases to save: 1) optimal, 2) feasible (optimal and suboptimal) and 3) unfeasible solutions
	 */
	public static void startDatabases() {
		Utility.createEmptyFile(Constants.db1_optimisedSolutions);
		Utility.createEmptyFile(Constants.db2_feasibleSolutions);
		Utility.createEmptyFile(Constants.db3_infeaibleSolutions);
		Utility.createEmptyFile(Constants.db4_paretoSolutions); //used after GA

		Utility.WriteToFile(Constants.db1_optimisedSolutions , "alloc,,robots,,permut,,attr,,time   (maxSucc value=prob. of failing times 100)");
		Utility.WriteToFile(Constants.db2_feasibleSolutions , "alloc,,robots,,permut,,attr,,time  (maxSucc value=prob. of failing times 100)");
		Utility.WriteToFile(Constants.db3_infeaibleSolutions , "alloc,,robots,,perm,,reason,,time");
		Utility.WriteToFile(Constants.db4_paretoSolutions , "alloc,,robots,,perm,,attr,time  (maxSucc value=prob. of failing times 100)"); //used after GA
	}
	
	
	
	
	
	
	
	// --for tests
	public static void runTest(ProblemSpecification p) {
		//---------------------------------------
		// -- New databases
		startDatabases();
		
		//------Input: (allocation, permutation)
		// 1 get info - create allocation (Test creating alloc./permutation)
		int allocNum = 0;
		
		allocNum=14;
		
		Allocation a1 = p.getAllocations().get(allocNum); //get first allocation
		//1.1 get JMetal permutation. String type, e.g.: "(1,1,1,1,443438)" where each number is the robot's task permutation
		String geneString = getMadeUpPermuation_forTest(a1,p); // create string permutation for testing, in JMetal encoded
		
		geneString = "(78,2,2,600)";
		
		System.out.println("allocation num:" + a1.getNum());
		
		AllocationProblem.getAttrib(p,a1,geneString);
	}
	

	private static String getMadeUpPermuation_forTest(Allocation a1,ProblemSpecification p) {
		String s = "(";
		for (int i = 0; i < a1.getRobotsList().size(); i++) {
			String rID = a1.getRobotsList().get(i);
			int r_max_permut = a1.getNumTaskPermutations(rID);
			s+=r_max_permut+",";
		}
		s = Utility.removeLastChars(s, 1)+")";
		return s;
	}
	

	// 3) GA runner
	public static void runGA(Allocation a, ProblemSpecification p) {
		//----- SET UP
		// a) problem setup    // based on https://jmetal.readthedocs.io/en/latest/experimentation.html
		AllocationProblem problem = new AllocationProblem(a,p);
		// crossover
		double crossoverProbability = 0.9; // - example: double crossoverProbability = 0.9;
		double crossoverDistributionIndex = 5.0; //-example: double crossoverDistributionIndex = 20.0;
		CrossoverOperator<IntegerSolution> crossover = new IntegerSBXCrossover(crossoverProbability, crossoverDistributionIndex); //CrossoverOperator<DoubleSolution> crossover = new SBXCrossover(crossoverProbability, crossoverDistributionIndex);  //-example: CrossoverOperator<DoubleSolution> crossover = new SBXCrossover(crossoverProbability, crossoverDistributionIndex);
		
		// mutation
		double mutationProbability = 0.9; //- AllocationScheduler and example: double mutationProbability = 1.0 / problem.getNumberOfVariables();
		double mutationDistributionIndex = 10.0; //- example: 20, plan schedule =5
		MutationOperator<IntegerSolution> mutation = new IntegerPolynomialMutation(mutationProbability, mutationDistributionIndex);  //MutationOperator<DoubleSolution> mutation = new PolynomialMutation(mutationProbability, mutationDistributionIndex); // -example: MutationOperator<DoubleSolution> mutation = new PolynomialMutation(mutationProbability,mutationDistributionIndex);
		
		//selector
		SelectionOperator<List<IntegerSolution>, IntegerSolution> selection = new BinaryTournamentSelection<IntegerSolution>();
		//new PolynomialMutation(1.0/problem.getNumberOfVariables() , 20 )
		//Termination termination = new TerminationByEvaluations(75000);
		//Ranking<DoubleSolution> ranking = new MergeNonDominatedSortRanking<>();
		
		// population size 		//Future work----make it proportional to the number of possible permutations
		int populationSize = Utility.checkEven("GA population", Utility.string2int(Constants.num_population)); //HAS to be even num.
		
		// b) set NSGAII algorithm
		NSGAII<IntegerSolution> algorithm = new NSGAIIBuilder<>(problem, crossover, mutation, populationSize)
		        .setSelectionOperator(selection)
		        .setMaxEvaluations(Utility.string2int(Constants.num_evaluations))//25000)
		        .build();
		
		
//		@SuppressWarnings("unchecked")   // solutions are DOUBLE, genes are INTEGERS
//		Algorithm<List<IntegerSolution>> algorithm22 = new NSGAII( // following example of builder from: org.uma.jmetal.algorithm.multiobjective.nsgaii
//											problem,
//											Integer.parseInt(Constants.num_evaluations),//maxEvaluations
//											populationSize, //populationSize
//											populationSize, //matingPoolSize
//											populationSize, //offspringSize
//											crossover, //crossoverOperator
//											mutation, //mutationOperator  - second parameter: distribution index: he distribution index η in the SBX operator controls the distance between two offsprings and two parents. If the value of η is large, the probability that the generated offsprings are closer to the two parents is greater; if the value of η is relatively small, the probability that the generated offsprings are farther away from the two parents is greater. 
//											new RandomSelection(), //selectionOperator     - I selected randomed based on results table from: https://www.researchgate.net/publication/2372815_Comparison_of_Selection_Methods_for_Evolutionary_Optimization
//											//new MultiThreadedSolutionListEvaluator<AllocationProblem>(1) //not working
//											new SequentialSolutionListEvaluator<AllocationProblem>() // evaluator
//											);
		
		
		
		//-------- RUN GA
		// c) run GA algorithm				// instead of algorithm.run(); to get more info
		AlgorithmRunner algorithmRunner = new AlgorithmRunner.Executor(algorithm).execute() ; //if accessing info at runtime
		
		//--------- READ RESULTS
		// d) Pareto optimal solutions
		//save
		List<IntegerSolution> populationSolution = algorithm.getResult() ;
		for (IntegerSolution solution : populationSolution) {
			
			double attr_val = solution.objectives()[0]; //check any value. If infinite, remove
            if (attr_val<Utility.infiniteInt) { //remove "infinite" (as JMetal minimises attributes, if many evaluate to infinite, these may be added but they are not feasible, just part of the Pareto of solutions)
		        //get solution info
	            ArrayList<String> rob = a.getRobotsList();
	            String perm = (String) solution.attributes().get("perm");
	            String time = Long.toString(Long.parseLong(solution.attributes().get("time").toString()));
	            HashMap<String, Double> attr =  optimalVal2Map(p,solution);
	            // save in database
	            AllocationProblem.saveGAOptimalDatabase(a.getNum(), rob, perm, attr,  time); // in database
	            // save in problem spec.
	            countSol_id+=1;
	            ScheduleGA sol = new ScheduleGA(countSol_id,rob,a.getNum(),perm,attr,time); //in problem spec.
	    		p.addScheduleGA(sol);
			}
        }	
		
	    //print JMetal info
	    printFinalSolutionSet(populationSolution);
	    
	    // print time
	    long computingTime = algorithmRunner.getComputingTime() ;
	    System.out.println("Total execution time GA: " + computingTime + "ms");
	    
	    System.out.println("Total execution time: " + Timer.getTimeSoFar() + "ms");
	    
		System.out.println("GA loop done");	
	}
	
	
	/**Reading GA Pareto-optimal front and map to attributes names*/
	private static HashMap<String, Double> optimalVal2Map(ProblemSpecification p, IntegerSolution solution) {
		HashMap<String, Double> attr = new HashMap<String, Double>();
		double[] attr_val = solution.objectives(); //values from GA
		for(int i=0; i<attr_val.length ; i++) {
			String name = p.getParameters().getListObjectiveStrings().get(i); //name of objective
			attr.put(name,attr_val[i]);
		}
		return attr;
	}



	
	
	
	
}



