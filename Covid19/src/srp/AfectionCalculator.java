package srp;

import java.util.Map;

public class AfectionCalculator {

	
	public double afectionCalculator(Map<Symptom,Integer> symptoms) {
		double afection=0;
		for (Symptom c:symptoms.keySet())
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
		
		return afection;
	}
}
