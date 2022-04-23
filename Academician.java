
public class Academician extends Personnel {

	public static double ssbenefits() { //To calculating ssbenefits
		if(job.equals("FACULTY_MEMBER")) {
			double ssbenefits=(basesalary*135)/100;
			return ssbenefits;
		}
		else {
			int ssbenefits=(basesalary*105)/100;
			return ssbenefits;
		}
	}
}
