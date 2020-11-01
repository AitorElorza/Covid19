package isp;

public class CalcIncrement {

	public double getIncrementedByYear(InterfacegetYears y, int afection) {
		if(y.getYears()>65)
			return afection*0.5;
		else
			return 0;
	}
}
