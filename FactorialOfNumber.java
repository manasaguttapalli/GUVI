import java.util.Scanner;
public class FactorialOfNumber {

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
		else if(n==1){
			return 1;
		}
		
		else{
			return (n*fact(n-1));
			
		}
		
	}


}
