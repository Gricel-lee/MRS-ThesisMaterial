/* MRS -- Gricel Vazquez
 * 2023
 * 
 * Main class. Run multi-robot system (MRS) task allocation and scheduling.
*/

package uoy.mrs.uoy.mrs;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import uoy.mrs.uoy.mrs.alloy.RunAlloy;
import uoy.mrs.uoy.mrs.auxiliary.Constants;
import uoy.mrs.uoy.mrs.auxiliary.Timer;
import uoy.mrs.uoy.mrs.auxiliary.Utility;
import uoy.mrs.uoy.mrs.auxiliary.prescheduling.PreTaskScheduler;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.Scheduler;
import uoy.mrs.uoy.mrs.error.KanoaErrorHandler;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.ParetoOptimalFinder;

public class Kanoa {
	
	ProblemSpecification problemSpec = new ProblemSpecification();
	
	public Kanoa()	{}
	
	
	//test allocation time
	public static void main_( String[] args )  throws Exception{
		/**Create Kanoa instance**/
		Kanoa kanoaMRS = new Kanoa(); 	
		
		/**Set config.properties**/		
		String fileTest = "";
		
		//---- Hospital
		//fileTest = "KanoaTestbed/Hospital/AllocTime/Hospital/config.properties";
		
		//---- Bo-Alpha
		fileTest = "KanoaTestbed/Hospital/AllocTime/BoAlpha/config.properties";

		System.out.println(fileTest);
		
		kanoaMRS.setPropertiesFile(args,fileTest);
//		
		
		//run N tests
		int n_runTestNtimes = 100;
		
		String newPath = Constants.filespath+"/allocVaryTimes.txt";
		Utility.createEmptyFile(newPath);	//create file
        System.out.println(newPath);
		
        Utility.WriteToFile(newPath, "alloc,time" );
        kanoaMRS.setPropertiesFile(args,fileTest);
        
		for (int i = 1; i<=n_runTestNtimes; i++) {
			Timer.getTime_restart();
			Constants.num_instances = Utility.int2string( 10*(i) );
			/**Run**/ 
	    	kanoaMRS.runAlloc();
	    	//-- save results 
	    	String s = String.valueOf(Constants.num_instances) + "," + String.valueOf(Timer.getTime_no_restart());
	    	Utility.WriteToFile(newPath, s );
		}
		
    	
		
	}
	
	public void runAlloc() throws Exception {
		//------- Load DSL info
		problemSpec.initialise(Constants.infoDSLFile, Constants.genMissionTree);
		//------- Timer
		Timer.startTimer();// start Timer; 
		//------- Allocator    //Pre-allocation done in Xtend
    	runAllocator();
    	
    	System.out.println("Time: "+Timer.getTimeSoFar()+"ms");
    }
	
	
	
	
	public static void main( String[] args )  throws Exception{
		/**Create Kanoa instance**/
		Kanoa kanoaMRS = new Kanoa(); 	
		
		/**Set config.properties**/		
		String fileTest = "";
		
		
		//---- Bo-Alpha
		//fileTest = "KanoaTestbed/Hospital/BoAlpha/BoAlpha/config.properties";
		fileTest = "KanoaTestbed/Hospital/BoAlpha/BoAlpha-14robots/config.properties";
		//fileTest = "KanoaTestbed/Hospital/BoAlpha/BoAlpha-m-20missions/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/BoAlpha/BoAlpha/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/BoAlpha/Robots/BA-r3-19/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/BoAlpha/Robots/BA-r3-19/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/BoAlpha/Robots/BA-r4-16/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/BoAlpha/Robots/BA-r4-t30-17/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/BoAlpha/Robots/BA-r4-dt30-16/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t2-j0c1o0/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t6-j0c3o0/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t10-j0c5o0/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t10-j0c0o5/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t18-j0c0o9/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t22-j0c0o11/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r3t26-j0c0o13/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/BoAlpha/B-r5t2-j2c0o0/config.properties";
		
		//B-r5t2-j2c0o0
		
		//---- Hospital
		//fileTest = "KanoaTestbed/Hospital/Hospital/config.properties"; //"TestCase3-var4/config.properties"); //Constants.setProperties("TestAlloyPreallocatedTasks/HospitalPreallocatedTasks1/config.properties");
				
//		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r5-t15/config.properties";
//		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r5-t15-i30/config.properties";
//		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r5-t15-i40/config.properties";
		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r4-t8-i20/config.properties";
//		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r4-t11-i20/config.properties";
//		
//		fileTest = "KanoaTestbed/Hospital/AllRobotsDeployed/Hospital/Robots/H-r4-t14-i20/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t15-j3c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t17-j5c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t19-j7c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t17-j2c0o5/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t20-j2c0o6/config.properties";
		
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t29-j2c0o9/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t17-j2c5o0/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r5t17-j2c1o4/config.properties";
		
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r9t12-j2c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r7t12-j2c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r6t14-j1c0o4/config.properties";
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r8t14-j1c0o4/config.properties";
		
		
		fileTest = "KanoaTestbed/Hospital/anwer-RQ2-varyRobotsTasks/Hosp/H-r13t14-j1c0o5/config.properties";
		// Testing perm. 
		//fileTest = "KanoaTestbed/Hospital/Hosp/Hospital/config.properties";
		
		System.out.println(fileTest);
		kanoaMRS.setPropertiesFile(args,fileTest);
		
		/**Run**/ 
    	kanoaMRS.run();
    }
	
	
	
	/*Config.properties file*/
	public void setPropertiesFile(String[] args,String fileString) throws Exception {
		System.out.println("\n---- Reading config.prop file");
		if (args.length > 0)
			Constants.setProperties(args[0]);
		else 
			Constants.setProperties(fileString);	
		
	}
	
	
	public void saveTimer() {
		String newPath = Constants.filespath+"/allocVaryTimes.txt";
		Utility.createEmptyFile(newPath);	//create file
        System.out.println(newPath);
        Utility.WriteToFile(newPath, "alloc,time" );
        
        //-- save results 
        String s = String.valueOf(Constants.num_instances) + "," + String.valueOf(Timer.getTime_no_restart());
    	Utility.WriteToFile(newPath, s );
	}
	
	
	/*Run*/
	public void run() throws Exception {
		//------- Load DSL info
		problemSpec.initialise(Constants.infoDSLFile, Constants.genMissionTree);
		//------- Timer
		Timer.startTimer();// start Timer; 
		//------- Allocator    //Pre-allocation done in Xtend
    	runAllocator();
    	saveTimer();
    	
    	//------- Pre-scheduler
    	runPreTaskScheduler();
    	//------ Scheduler
    	runScheduler();
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
	public void runScheduler() throws Exception {
		System.out.println("\n\n---- Running Scheduler, GA optimisation");
		
		// a) -- if testing -- 
		//Scheduler.runTest(problemSpec); //- test one of the models
		
		// a) get Pareto set of solutions for each allocation
		Scheduler.run(problemSpec); //- run GA
		
		removeRepeatedLines(Constants.db2_feasibleSolutions);
		// 3) get single Pareto set
		ParetoOptimalFinder.getParetoOptimal();
		
		System.out.println("Done - "+Constants.db4_paretoSolutions);
		
		//System.exit(0);
    	
		
	}
	
	
	public static String splitLine(String line) {
		String[] parts = line.split(",");

        // Reconstruct the line without the text after the last comma
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            newLine.append(parts[i]);
            if (i < parts.length - 2) {
                newLine.append(",");
            }
        }
		return newLine.toString();
	}
	
	
	public static void removeRepeatedLines(String file) {
        // Input and output file paths
        String inputFile = file;
        String outputFile = inputFile+"NoDuplicates.txt";

        try {
            // Read lines from input file and store unique lines in a LinkedHashSet to maintain order
            Set<String> uniqueLines = new LinkedHashSet<>();
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                //uniqueLines.add(line);
            	uniqueLines.add(splitLine(line));
            }
            reader.close();

            // Write unique lines back to the output file while maintaining order
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String uniqueLine : uniqueLines) {
                writer.write(uniqueLine);
                writer.newLine();
            }
            writer.close();


            System.out.println("Duplicates removed. Output written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}

