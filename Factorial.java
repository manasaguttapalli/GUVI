import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=1;
		res=fact(n);
		System.out.println(res);
		

	}

	private static int fact(int n) {
		if(n==0){
			return 1;
			}
		
		else{
			return (n*fact(n-1));
			
		}
		
	}


}