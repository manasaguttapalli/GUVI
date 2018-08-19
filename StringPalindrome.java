import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String original, reverse = ""; // Objects of String class
	      original = s.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("yes");
	      else
	         System.out.println("no");

	}

}
