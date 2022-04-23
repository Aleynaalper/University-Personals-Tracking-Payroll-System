
public class ResearchAssistant extends Academician {
	public static double calculating() { //To calculating total salary
		
		double severancepay= SeverancePay(year);
		double ssbenefits=ssbenefits();
		double salary=basesalary+severancepay+ssbenefits;
		
		return salary;
		

	}

}
