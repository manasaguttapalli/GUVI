import java.util.Scanner;
public class CaptalizeFirstLetter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String line = s.nextLine();
		 String upper_case_line = ""; 
	       Scanner sc = new Scanner(line); 
	         while(sc.hasNext()) {
	             String word = sc.next(); 
	             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	      System.out.println(upper_case_line.trim()); 
	}

}
