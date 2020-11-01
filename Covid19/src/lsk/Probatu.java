package lsk;
public class Probatu {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Covid19Pacient gaixoa = new Covid19Pacient("Xabier",21);
		Symptom cvs= new Symptom();
		cvs.setName("Cardio Vascular");
		cvs.setSeverityIndex(1);
		cvs.setCovidImpact(2);
		Symptom rs=new CurableSymptom();
		rs.setName("Respiratory Symptom");
		rs.setCovidImpact(2);
		rs.setSeverityIndex(2);
		Symptom nms= new CurableSymptom();
		nms.setName("Neuro Muscular");
		nms.setCovidImpact(2);
		nms.setSeverityIndex(3);
		
		
		gaixoa.addSymptom((Symptom) cvs, 2);
		gaixoa.addSymptom((Symptom) rs, 3);
		gaixoa.addSymptom((Symptom) nms, 1);
		
	 
		double impact =gaixoa.calcCovid19Impact();
		System.out.println(impact);

		
		gaixoa.cure();
		 
		
		
	}
	

}
