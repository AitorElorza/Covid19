package isp;

public class CalcIncrement {

	public double getIncrementedByYear(Pacient p, int afection) {
		if(p.getYears()>65)
			return afection*0.5;
		else
			return 0;
	}
}
