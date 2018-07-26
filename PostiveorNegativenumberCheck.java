import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		    if(n==0)
         {
			    System.out.println("Zero");
		   }
		  else if(n>0)
        {
			    System.out.println("Positive");
	  	}
		else if(n<0)  
       {
			     System.out.println("Negative");
		    }
		else  
       {
			   System.out.println("not an integer");
		  }

	}

}
