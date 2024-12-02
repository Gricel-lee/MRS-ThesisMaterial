package evaluation.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.uma.jmetal.util.AbstractAlgorithmRunner;

import uoy.mrs.uoy.mrs.auxiliary.Utility;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.AllocationProblem;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.Scheduler;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.Allocation;

public class SchedulerEval extends AbstractAlgorithmRunner{
	
	//private static int countSol_id = 0;
	
	
	public static void run(ProblemSpecification p, int numRandom_alloc_perm_pairs_toTest) {
		System.out.println(""+ p.getParameters().getNumObjectives()+" objectives:"+p.getParameters().getListObjectiveStrings());
		
		// -- new databases
		Scheduler.startDatabases();
		
		
		// generate N random possible (alloc,perm) solutions
		for (int i=0; i<numRandom_alloc_perm_pairs_toTest; i++) {
			
			//- get random allocation
			//long seed = 12; //seed only for reproducibility
			//Random rand = new Random(seed);
			Random rand = new Random();
	        int allocNum = rand.nextInt(p.getAllocations().size());
	        Allocation a = p.getAllocations().get(allocNum);
	        // - get random permutation (as it would in JMetal)
	        List<Integer> perm_upBound = AllocationProblem.getUpperBounds(a);
	        String perm = "(";
	        for(Integer up:perm_upBound ) {
	        	int perm_ri = rand.nextInt(up)+1;
	        	perm+= Utility.int2string(perm_ri)+",";
	        }
	        perm= Utility.removeLastChar(perm)+")";
        	//print info
	        System.out.println(i+ " of "+ numRandom_alloc_perm_pairs_toTest +"- alloc:"+ (allocNum+1) +"- perm:" + perm);
	        a.print_num_tasks_per_robot();
	        
	        //System.out.println("\n-Task schedules for Allocation "+a.getNum() +" with " + a.getGroupsOfRobot().size() +" clusters." );
	        
	        // run as in GA
	        runGetAttr(a,p,perm);
		}
		
		
	}
	
	
	
	

	


	// 3) GA runner
	public static void runGetAttr(Allocation a, ProblemSpecification p, String perm) {
		//----- SET UP
		// a) problem (PRISM) setup
		AllocationProblemEval_PRISM problem = new AllocationProblemEval_PRISM(a,p);
		//b) evaluate alloc,perm
		HashMap<String, Double> attrMap = problem.evaluate(perm);
		
		
		//--------- READ RESULTS
		// d) solution
		//save
		double attr_val = Utility.iteratorTolist(attrMap.values())[0];  //check any value. If infinite, remove
        if (attr_val<Utility.infiniteInt) { //remove "infinite" (as JMetal minimises attributes, if many evaluate to infinite, these may be added but they are not feasible, just part of the Pareto optimal solutions)
	        //get solution info
            ArrayList<String> rob = a.getRobotsList();
            String time = attrMap.get("time").toString(); //get time
            attrMap.remove("time"); //remove time, the rest are the attributes
            HashMap<String, Double> attr =  attrMap;
                        
            // save in database
            AllocationProblem.saveGAOptimalDatabase(a.getNum(), rob, perm, attr,  time); // in database
            
            // Remove create schedule to save memory as only for tests
            //countSol_id+=1;
            //ScheduleGA sol = new ScheduleGA(countSol_id,rob,a.getNum(),perm,attr,time); //in problem spec.
    		//p.addScheduleGA(sol);
		}
	}
	
	
	
	
}



