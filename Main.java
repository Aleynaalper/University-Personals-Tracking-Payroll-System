
public class Main {

	public static void main(String[] args) {
		
		String[] lines1 = Personnel.readFile(args[0]);   //I created array for personnel.txt
		String[] lines2 = Personnel.readFile(args[1]);	 //I created array for monitoring.txt

		Personnel.searching(lines1,lines2);
		
	}
}
