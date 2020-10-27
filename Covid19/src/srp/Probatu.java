package srp;
public class Probatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covid19Pacient gaixoa = new Covid19Pacient("Xabier",21);
		CardioVascularSymptom cvs= new CardioVascularSymptom(1,2);
		RespiratorySymptom rs=new RespiratorySymptom(2,2);
		NeuroMuscularSymptom nms= new NeuroMuscularSymptom(2,3);
		
		
		gaixoa.addSymptom((Symptom) cvs, 2);
		gaixoa.addSymptom((Symptom) rs, 3);
		gaixoa.addSymptom((Symptom) nms, 1);
		
	 
		double impact =gaixoa.calcCovid19Impact();
		System.out.println(impact);
		
	}
	

}
