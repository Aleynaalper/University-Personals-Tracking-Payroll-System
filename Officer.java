
public class Officer extends Personnel {
	
	public static double calculating() { //To calculating total salary
		
		int a= week1-40;   //If extra working time is more than 10, it takes 10 hours money
		if(a>10)
			a=10;
		int b= week2-40;
		if(b>10)
			b=10;
		int c= week3-40;
		if(c>10)
			c=10;
		int d= week4-40;
		if(d>10)
			d=10;
		
		double overworksalary=(a+b+c+d)*20;
		double severancepay= SeverancePay(year);
		double ssbenefits=(basesalary*65)/100;
		
		double salary=basesalary+severancepay+ssbenefits+overworksalary;

		return salary;
				
		
		
	}

}
