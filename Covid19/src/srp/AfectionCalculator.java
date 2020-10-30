package srp;

import java.util.Map;

public class AfectionCalculator {

	
	public double afectionCalculator(Map<Symptom,Integer> symptoms) {
		double afection=0;
		int elems=0;
		for (Symptom c:symptoms.keySet())
			if (c.getCovidImpact()>50) {
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
			elems++;
			}
		if(elems==0) {
			return 0;
		}
		else {
			return afection/elems;
		}
	}
}
