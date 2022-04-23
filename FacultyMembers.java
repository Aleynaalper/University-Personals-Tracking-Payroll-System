
public class FacultyMembers extends Academician {
	public static double calculating() {  ////To calculating total salary
		
		int a= week1-40;      //If addcourseFee is more than 8, it takes 8 hours money
		if(a>8)
			a=8;
		int b= week2-40;
		if(b>8)
			b=8;
		int c= week3-40;
		if(c>8)
			c=8;
		int d= week4-40;
		if(d>8)
			d=8;
		
		double addcourseFee=(a+b+c+d)*20;
		double severancepay= SeverancePay(year);
		double ssbenefits=ssbenefits();
		
		double salary=basesalary+addcourseFee+severancepay+ssbenefits;

		return salary;
	}
	}


