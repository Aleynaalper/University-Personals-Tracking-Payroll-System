
public class Worker extends FullTime {
	public static double calculating() { //If working time is more than 54, it takes 54 hours money
		
		double overworksalary=(overworksalary())*11;
		double severancepay= SeverancePay(year);
		double salary1=105*5*4;
		
		double salary=salary1+overworksalary+severancepay;

		return salary;
		
		
		
	}

}
