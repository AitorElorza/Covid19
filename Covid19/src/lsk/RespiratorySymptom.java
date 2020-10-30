package lsk;

public class RespiratorySymptom implements Symptom{
	private int covidImpact;
	private int severityIndex;
	private int affectedDays;
	
	public RespiratorySymptom(int covidImpact, int severityIndex) {
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

	public int getAffectedDays() {
		return affectedDays;
	}

	public void setAfecctedDays(int days) {
		affectedDays=days;
		
	}
	
}
