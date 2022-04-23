
public class Security extends Personnel {
	public static double calculating() { ////To calculating total salary
		int i = 4; //Number of week in a month
		
		if(week1>54)  //If working time is more than 54, it takes 54 hours money
			week1=54;
		if(week1<30) { //If working time is less than 10, it doesn't take any money
			week1=0;
			i-=1;
		}
		if(week2>54)			
			week2=54;
		if(week2<30) {
			week2=0;
			i-=1;
		}
		if(week3>54)
			week3=54;
		if(week3<30) {
			week3=0;
			i-=1;
		}
		if(week4>54)
			week4=54;
		if(week4<30) {
			week4=0;
			i-=1;
		}
		
		double salary1= (week1+week2+week3+week4)*10;
		double severancepay= SeverancePay(year);
		
		int foodmoney=10;
		int transmoney=5;
		double additionalexpenses=(foodmoney+transmoney)*6*i;  //I multiplied the food and trans money by 6 
															   //because they work 6 days a week
		double salary=salary1+severancepay+additionalexpenses;
		
		return salary;
		
		

	}
}


