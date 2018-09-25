import java.util.Scanner;
public class CaptalizeFirstLetter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String str1 = s.next();
		 String str2=s.next();
		 String res11=str1.substring(0, 1).toUpperCase();
		 String res12=str1.substring(1).toLowerCase();
		 String res21=str2.substring(0, 1).toUpperCase();
		 String res22=str2.substring(1).toLowerCase();
		 System.out.println(res11+res12+" "+res21+res22);
		 
	}

}
