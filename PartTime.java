
public class PartTime extends Employee {
	
	public static double calculating() { //To calculating total salary
		
		if(week1>20)       //If working time is more than 20, it takes 20 hours money
			week1=20;
		if(week1<10) {     ////If working time is less than 10, it doesn't take any money
			week1=0;
		}
		
		if(week2>20)			
			week2=20;
		if(week2<10) {
			week2=0;
		}
		
		if(week3>20)
			week3=20;
		if(week3<10) {
			week3=0;
		}
		
		if(week4>20)
			week4=20;
		if(week4<10) {
			week4=0;
		}
		
		double salary1= (week1+week2+week3+week4)*18;
		double severancepay= SeverancePay(year);
		double salary=salary1+severancepay;
		
		return salary;
		
		
	}

}
