
public class Chief extends FullTime {

	public static double calculating() { ////To calculating total salary
		
		double overworksalary=(overworksalary())*15;
		double severancepay= SeverancePay(year);
		double salary1=125*5*4;    
		
		double salary=salary1+overworksalary+severancepay;

		return salary;

		
		
	}
}
