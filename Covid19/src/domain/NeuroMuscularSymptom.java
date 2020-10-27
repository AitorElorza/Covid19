package domain;

public class NeuroMuscularSymptom implements Symptom{
	int covidImpact;
	int severityIndex;
	
	
	
	public NeuroMuscularSymptom(int covidImpact, int severityIndex) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	
	
	
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
}
