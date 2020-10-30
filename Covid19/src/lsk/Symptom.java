package lsk;

public class Symptom {
	public String name;
	
	public Symptom() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	int covidImpact; int severityIndex;
	
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+
				severityIndex+" covidImpact:"+covidImpact);
	}
//	public void cure(){
//		System.out.println("treatment applied to: "+name);
//	}
	public int getCovidImpact() {
		// TODO Auto-generated method stub
		return this.covidImpact;
	}
	public Integer getSeverityIndex() {
		// TODO Auto-generated method stub
		return this.severityIndex;
	}
}