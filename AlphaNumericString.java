import java.util.Scanner;
import java.util.regex.*;
public class BothAlphabetsNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String num=".*[0-9].*";
		String alpha=".*[A-Z].*";
		String salpha=".*[a-z].*";
		if (str.matches(num) && (str.matches(alpha)|| str.matches(salpha))) {
		    System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
	}
}
