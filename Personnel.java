import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Personnel {
	static int basesalary = 2600;
	static int week1;
	static int week2;
	static int week3;
	static int week4;
	static int year;
	static String job;
	static double salary;

	
	public static String[] readFile(String path) { //To reading
		try {
		int i = 0 ; 
		int length= Files.readAllLines(Paths.get(path)).size();
		String[] results=new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++]=line;
			}
		return results;
		} catch(IOException e ) {
			e.printStackTrace();
			return null;
		}
		
		}
	
	
	public static void searching(String[] lines1,String[] lines2) {//To finding which job 
		for(int i=0;i<lines1.length;i++) {
			String[] a= lines1[i].split("	");  
			String[] b= lines2[i].split("	");
			
			if(a[2].equals("FACULTY_MEMBER")) {
				controlling(a, b);
				salary=FacultyMembers.calculating();
			}
			if(a[2].equals("RESEARCH_ASSISTANTS")) {
				controlling(a, b);
				salary=ResearchAssistant.calculating();
			}
			if(a[2].equals("OFFICER")) {
				controlling(a,b);
				salary=Officer.calculating();	
			}
			if(a[2].equals("PARTTIME_EMPLOYEE")) {
				controlling(a,b);
				salary=PartTime.calculating();
			}
			if(a[2].equals("WORKER")) {
				controlling(a,b);
				salary=Worker.calculating();
			}
			if(a[2].equals("CHIEF")) {
				controlling(a,b);
				salary=Chief.calculating();
				
			}
			if(a[2].equals("SECURITY")) {
				controlling(a, b);
				salary=Security.calculating();
				
			}
			String filename=a[1]+".txt"; //To printing to txt file for each personnel seperately
			File file = new File(filename);
		    try(BufferedWriter x = new BufferedWriter(new FileWriter(file))){
		    		
		     String[] namesurname=a[0].split(" ");   
		     
		                x.write("Name : "+ namesurname[0]);
		                x.newLine();
		                x.write("Surname : "+namesurname[1]);
		                x.newLine();
		                x.write("Registration Number : "+a[1]);
		                x.newLine();
		                x.write("Position : "+a[2]);
		                x.newLine();
		                x.write("Year of Start : "+a[3]);
		                x.newLine();
		                x.write("Total Salary : "+String.format(java.util.Locale.US,"%.2f",salary)+" TL");
		                          
	         
		        x.close();
		    } catch (IOException e) {
		        System.out.println("Unable to read file " +file.toString());
		        
		    }
			
		}
	}
	
	public static void controlling(String[] lines1, String[]lines2) {//To assign values to variables
		week1=Integer.parseInt(lines2[1]);
		week2=Integer.parseInt(lines2[2]);
		week3=Integer.parseInt(lines2[3]);
		week4=Integer.parseInt(lines2[4]);
		year=Integer.parseInt(lines1[3]);
		job=lines1[2];	
	}
	
	
	public static double SeverancePay(int year) { //To calculating severance pay
		double severancepay= ((2020-year) * 20 * 0.8);	
		return severancepay;
	}
	
		   
	 }
	
	
	

