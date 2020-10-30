package lsk;


import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{

	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}

	Map<Symptom,Integer> symptoms =new HashMap<Symptom,Integer>();
	AfectionCalculator acalc= new AfectionCalculator();
	IncrementCalculator icalc = new IncrementCalculator(); 



	public void addSymptom(Symptom c, Integer w) {
		symptoms.put(c,w);
	}
	public void showSymptoms(){
		for (Symptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms.keySet())
			if(s instanceof CurableSymptom) {
				((CurableSymptom)s).cure();
			}
	}



	public double calcCovid19Impact() {
		double afection= acalc.afectionCalculator(symptoms);
		double increment=icalc.incrementCalculator(afection, this.getYears());
		double impact;


		//calculate impact
		impact=afection+increment;
		return impact;
	}

	//	public int sanatedDays() {
	//		int days=0;
	//		for (Symptom c:symptoms.keySet()) {
	//			if(days<c.getAffectedDays()) {
	//				days=c.getAffectedDays();
	//			}
	//		}
	//		return days;
	//	}


}
