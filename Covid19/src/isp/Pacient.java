package isp;

import java.util.LinkedList;

public class Pacient {

	String name;
	int years;
	//LinkedList<Symptom> symptoms= new LinkedList<Symptom>();
	
	public Pacient(String name, int years) {
		super();
		this.name = name;
		this.years = years;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
}
