package evaluation.random;

import java.util.HashMap;

import parser.ast.ModulesFile;
import prism.Prism;
import prism.PrismDevNullLog;
import prism.PrismException;
import prism.PrismLog;
import prism.PrismSettings;
import uoy.mrs.uoy.mrs.auxiliary.Constants;
import uoy.mrs.uoy.mrs.auxiliary.Timer;
import uoy.mrs.uoy.mrs.auxiliary.scheduler.AllocationProblem;
import uoy.mrs.uoy.mrs.error.KanoaErrorHandler;
import uoy.mrs.uoy.mrs.types.ProblemSpecification;
import uoy.mrs.uoy.mrs.types.impl.Allocation;

/**
 * For an example, check org.uma.jmetal.problem.multiobjective.zdt ZDT1;
 * 
 */
public class AllocationProblemEval_PRISM {
	Allocation a1; // save info about allocation
	ProblemSpecification p;
	Prism PRISM; // prism instance
	ModulesFile modulesFile; //modules from prism
	
	// counter for average times
	int countFeas = 0;
	int countTotal = 0;
	
	/** a) Constructor */
	public AllocationProblemEval_PRISM(Allocation a, ProblemSpecification p) {
		// set local variables
	    this.a1 = a; this.p = p;
	    this.PRISM = Constants.PRISM;
	}
	
	
	/** b) Evaluate() method. - modified for random generation from JMetal Kanoa version
	 */
	public HashMap<String, Double> evaluate(String permutationString)  {
		// get attributes
		double[] attr = AllocationProblem.getAttrib(p,a1,permutationString); //permutationString e.g., (5,3,1,2,58)
		
		//get time
		long time = Timer.getTime_no_restart();
		System.out.println("Time: " + time);
		
		// save in map array
		HashMap<String, Double> attrMAp = new HashMap<String, Double>();
		int i=0;
		for (String s: p.getParameters().getListObjectiveStrings()) {
			attrMAp.put(s, attr[i]);
			i+=1;
		}
		attrMAp.put("time", (double) time);
		return attrMAp;
	  }
	
	
	
	
	

}
