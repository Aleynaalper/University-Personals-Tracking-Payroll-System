
public class FullTime extends Employee {
	static int hours;
	
	public static double overworksalary() {
		if(job.equals("WORKER")) { //For workers, overwork hours cannot more than 10
			hours=10;
		}
		else {
			hours=8;//For chiefs, overwork hours cannot more than 8
		}
	
			int a =week1-40;  //If extra working time is more than "a", it takes "a" hours money
			if(a>hours) {
				a=hours;
			}
			int b= week2-40;
			if(b>hours) {
				b=hours;
			}
			int c= week3-40;
			if(c>hours) {
				c=hours;
			}
			int d= week4-40;
			if(d>hours) {
				d=hours;
			}
			return (a+b+c+d);

			

}
}

