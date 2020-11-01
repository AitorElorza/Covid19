package isp;


public class Probatu {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcIncrement ci = new CalcIncrement();
		
		Covid19Pacient gaixoa = new Covid19Pacient("Xabier",21);
		Pertsona gaixoa2 = new Pertsona();
		gaixoa2.setName("Xabier");
		gaixoa2.setAdina("70");
		Symptom cvs= new Symptom();
		cvs.setName("Cardio Vascular");
		cvs.setSeverityIndex(1);
		cvs.setCovidImpact(2);
		Symptom rs=new Symptom();
		rs.setName("Respiratory Symptom");
		rs.setCovidImpact(2);
		rs.setSeverityIndex(2);
		Symptom nms= new Symptom();
		nms.setName("Neuro Muscular");
		nms.setCovidImpact(2);
		nms.setSeverityIndex(3);
		
		//AbstractIncrementCalculator aic= new IncrementCalculator();
		AbstractAfectionCalculator aac =new AfectionCalculator();
		
		
		gaixoa.addSymptom(cvs, 2);
		gaixoa.addSymptom(rs, 3);
		gaixoa.addSymptom(nms, 1);
		
	 
		//double impact =gaixoa.calcCovid19Impact(aac);
		
		double impact2 = ci.getIncrementedByYear(gaixoa2, 40);
		System.out.println(impact2);
		//System.out.println(impact);
		
	}
	

}
