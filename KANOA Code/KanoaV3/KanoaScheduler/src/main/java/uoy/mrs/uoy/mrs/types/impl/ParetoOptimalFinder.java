package uoy.mrs.uoy.mrs.types.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uoy.mrs.uoy.mrs.auxiliary.Constants;



public class ParetoOptimalFinder{
	
	/**Get single Pareto set of solutions
	 * @return */
    public static void getParetoOptimal() {
        String inputFileName = Constants.db1_optimisedSolutions;
        String outputFileName = Constants.db4_paretoSolutions;        
        getParetoOptimal(inputFileName, outputFileName);
    }
    
    private static void getParetoOptimal(String inputFileName,String outputFileName) {
    	List<String> paretoOptimalLines = new ArrayList<>();
    	int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
            	if (count==0) {count += 1;continue;}// Skip the first line
                if (line.trim().isEmpty()) {continue;} // Skip empty lines
                // get attr values
                double minIdle = Double.parseDouble(line.split(",,")[3].split(",")[0].split("=")[1]);
                double maxSucc = Double.parseDouble(line.split(",,")[3].split(",")[1].split("=")[1]);
                double minTravel = Double.parseDouble(line.split(",,")[3].split(",")[2].split("=")[1].replace("}", ""));

                // Check if the current line is Pareto optimal
                if (isParetoOptimal(minIdle, maxSucc, minTravel, inputFileName,count)) { paretoOptimalLines.add(line); }
                count+=1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // no solutions
        if(count==1) {System.out.println("No solutions found.");}
        // Write Pareto optimal lines to the output file
        else {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
	        	writer.write("alloc,,robots,,permut,,attr,,time   (maxSucc value=prob. of failing times 100)\n");
	            for (String line : paretoOptimalLines) {
	                writer.write(line);
	                writer.newLine();
	            }
	        } catch (IOException e) { e.printStackTrace(); }
	        System.out.println("Pareto optimal lines have been written to " + outputFileName);
        }
    }
    

    // Check if a point is Pareto optimal with respect to existing points
    private static boolean isParetoOptimal(double minIdle, double maxSucc, double minTravel, String inputFileName, int lineNum) {
    	int count = 0;
    	try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
            	if (count!=lineNum && count!=0) { //don't check same line
    	            double existingMinIdle = Double.parseDouble(line.split(",,")[3].split(",")[0].split("=")[1]);
    	            double existingMaxSucc = Double.parseDouble(line.split(",,")[3].split(",")[1].split("=")[1]);
    	            double existingMinTravel = Double.parseDouble(line.split(",,")[3].split(",")[2].split("=")[1].replace("}", ""));
    	            
    	            if (minIdle > existingMinIdle && maxSucc > existingMaxSucc && minTravel > existingMinTravel) {
    	            	return false; // Current point is dominated by an existing point
    	            }
            	}
            	count+=1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true; // Current point is Pareto optimal
    }
	
	
	
	
	
	//---------------------
	//for tests
	public static void main(String[] args) {
        String inputFileName = "/Users/grisv/GitHub/KanoaV3/KanoaScheduler/KanoaTestbed/Hospital/Hospital/results/Solutions/optimal.txt";
        String outputFileName = "/Users/grisv/GitHub/KanoaV3/KanoaScheduler/KanoaTestbed/Hospital/Hospital/results/Solutions/Pareto.txt";
        getParetoOptimal(inputFileName, outputFileName);
        
	}
	
	
	
	
}