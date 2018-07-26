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
			    System.out.println("positive");
	  	}
		else if(n<0)  
       {
			     System.out.println("negative");
		    }
		else  
       {
			   System.out.println("not an integer");
		  }

	}

}
