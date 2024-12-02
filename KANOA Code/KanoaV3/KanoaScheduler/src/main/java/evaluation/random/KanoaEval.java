/* MRS -- Gricel Vazquez
 * 2023
 * 
 * Main class. Run multi-robot system (MRS) task allocation and scheduling.
*/

package evaluation.random;

import java.io.File;

import uoy.mrs.uoy.mrs.alloy.RunAlloy;
import uoy.mrs.uoy.mrs.auxiliary.Constants;
import uoy.mrs.uoy.mrs.auxiliary.Timer;
import uoy.mrs.uoy.mrs.auxiliary.prescheduling.PreTaskScheduler;
import uoy.mrs.uoy.mrs.error.KanoaErrorHandler;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.ParetoOptimalFinder;

public class KanoaEval {
	
	ProblemSpecification problemSpec = new ProblemSpecification();
	
	public KanoaEval()	{}
	
	public static void main( String[] args )  throws Exception{
		
		
		/**Set config.properties**/
		
		String fileTest = "TestDummyRefactor-IdleNotFeasible/config.properties"; //"TestCase3-var4/config.properties"); //Constants.setProperties("TestAlloyPreallocatedTasks/HospitalPreallocatedTasks1/config.properties");
		
		fileTest = "KanoaTestbed/TestDummyRefactor/config.properties"; //"TestCase3-var4/config.properties"); //Constants.setProperties("TestAlloyPreallocatedTasks/HospitalPreallocatedTasks1/config.properties");
		
		
		//fileTest = "KanoaTestbed/Hospital/Hospital/config.properties"; int numRandom_alloc_perm_pairs_toTest = 1000;
		
		fileTest = "KanoaTestbed/Hospital/BoAlpha/BoAlpha/config.properties"; int numRandom_alloc_perm_pairs_toTest = 200;
		
		System.out.println(fileTest);
		
		
		//run N tests
		int n_runTestNtimes = 5;
    	
		for (int i = 0; i<n_runTestNtimes; i++) {
			/**Create Kanoa instance**/
			KanoaEval kanoaMRS = new KanoaEval(); 	
			kanoaMRS.setPropertiesFile(args,fileTest);
			
			/**Run**/
			//-- generate (alloc,perm) attribute values
			
			kanoaMRS.run(numRandom_alloc_perm_pairs_toTest);
			
			//-- copy results folder
			File source = new File(Constants.filespath);
			File destination = new File(Constants.filespath+"-"+(i+1));
			FolderCopy.copyFolder(source,destination);
		}
		
    	
    }
	
	
	
	/*Config.properties file*/
	public void setPropertiesFile(String[] args,String fileString) throws Exception {
		System.out.println("\n---- Reading config.prop file");
		if (args.length > 0)
			Constants.setProperties(args[0]);
		else 
			Constants.setProperties(fileString);	
		
	}
	
	
	
	/*Run*/
	public void run(int numRandom_alloc_perm_pairs_toTest) throws Exception {
		//------- Load DSL info
		problemSpec.initialise(Constants.infoDSLFile, Constants.genMissionTree);
		//------- Timer
		Timer.startTimer();// start Timer; 
		//------- Allocator    //Pre-allocation done in Xtend
    	runAllocator();
    	//------- Pre-scheduler
    	runPreTaskScheduler();
    	//------ Scheduler
    	runSchedulerRandom(numRandom_alloc_perm_pairs_toTest);
    	//-------Read Data
    	//readSchedules();  //HERE + check models - check previous Kanoa 
    	
    	//------ Get Plans Info
    	//PlotFactory.plotParetoFront(3);
    	
    	System.out.println("Time: "+Timer.getTimeSoFar()+"ms");
    }
	
	
	
	
	
	
	
	/**
	 * Run Alloy
	 */
	public void runAllocator(){
    	System.out.println("\n---- Running Task Allocator");
    	Constants.setalloyFilesOutput(RunAlloy.runAlloy(Constants.genAlloyModel,Constants.num_instances));
    	problemSpec.getAllocations();
    	//if no allocations found
    	if (!problemSpec.isThereAllocationsFound()) {KanoaErrorHandler.NoAllocationsFound();}	
   	}
	
	/*Run Transitive closure*/
	private void runPreTaskScheduler() {
		System.out.println("\n---- Pre-scheduler, transfering constraints to atomic tasks");
		// a) Transfer compound task constraints to atomic tasks
		PreTaskScheduler.tranferConstraints(problemSpec); 
		
		System.out.println("\n---- Pre-scheduler, getting clusters");
		// b) Clusters output file
		PreTaskScheduler.getRobotsGroupsForAllocations(problemSpec);
	}
	
	
	
	
	/**
	 * Run Multi-objective Optimisation
	 * Internally, runs PRISM for MDPs modelling a permutation of tasks
	 * @throws Exception
	 */
	public void runSchedulerRandom(int numRandom_alloc_perm_pairs_toTest) throws Exception {
		System.out.println("\n\n---- Running Scheduler, GA optimisation");
		
		//RESTART TIMER if not wanting to count time from Alloy creating allocations
		Timer.getTime_restart();
		
		// a) -- if testing -- 
		//Scheduler.runTest(problemSpec); //- test one of the models
		
		// a) get Pareto set of solutions for each allocation
		
		
		SchedulerEval.run(problemSpec,numRandom_alloc_perm_pairs_toTest); //- run GA
		
		// 3) get single Pareto set
		ParetoOptimalFinder.getParetoOptimal();
		
		System.out.println("Done - "+Constants.db4_paretoSolutions);
		
		
	}
}

