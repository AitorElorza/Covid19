package lsk;

public class CurableSymptom extends Symptom implements Cure{
	
	public CurableSymptom(){
		super();
	}

	
	 public void cure() {
		 System.out.println("treatment applied to: "+name); 
	 }
	
	

}
