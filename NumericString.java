import java.util.Scanner;
public class NumericString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		
		try  
		  {  
		    double d = Double.parseDouble(str);  
		    System.out.println("yes");
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		   System.out.println("No") ;  
		  }  
		  
}
}
