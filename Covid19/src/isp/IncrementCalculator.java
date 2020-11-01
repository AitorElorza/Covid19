package isp;

public class IncrementCalculator extends  AbstractIncrementCalculator {
	
	public double incrementCalculator(double afection,int age) {
		double increment=0;
		if (age>65) 
			increment=afection*0.5;
		return increment;
	}

}
