import java.util.Scanner;
public class ProductIsPerfectsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double pro=a*b;
		if(isPerfectSquare(pro)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}


static boolean isPerfectSquare(double x) 
{
    double sr = Math.sqrt(x);
 
    
    return ((sr - Math.floor(sr)) == 0);
	}
}
