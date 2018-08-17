import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int rem=0,sum=0;
		while(N!=0){
			rem=N%10;
			sum=sum+rem;
			N=N/10;
			
		}
		System.out.println(sum);
	}

}
