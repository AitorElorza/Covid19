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
	
	
	
	/*
	Map<CardioVascularSymptom,Integer> cardios=new HashMap<CardioVascularSymptom,Integer>();
	Map<NeuroMuscularSymptom,Integer> neuros=new HashMap<NeuroMuscularSymptom,Integer>();
	Map<RespiratorySymptom,Integer> respirs=new HashMap<RespiratorySymptom,Integer>();
	*/
	
	public void addSymptom(Symptom c, Integer w) {
		symptoms.put(c,w);
	}

	
	/*	
    public void addCardioSymptom(CardioVascularSymptom c, Integer w){
		cardios.put(c,w);
	}
	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm,Integer w){
		neuros.put(nm,w);
	}
	public void addRespiratorySymptom (RespiratorySymptom r,Integer w){
		respirs.put(r,w);
	}
	*/
	public double calcCovid19Impact() {
		double afection= acalc.afectionCalculator(symptoms);
		double increment=icalc.incrementCalculator(afection, this.getYears());
		double impact;
		//calculate afection
		/*for (Symptom c:symptoms.keySet())
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
		
		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		*/
		
		//calculate impact
		impact=afection+increment;
		return impact;
	}
	
	public int sanatedDays() {
		int days=0;
		for (Symptom c:symptoms.keySet()) {
			if(days<c.getAffectedDays()) {
				days=c.getAffectedDays();
			}
		}
		return days;
	}


}
