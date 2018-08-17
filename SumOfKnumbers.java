import java.util.Scanner;
public class SumOfKnumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int sum=0;
		for(int i=0;i<=N;i++){
			sum=i+sum;
		}
		System.out.println(sum);
	}

}
