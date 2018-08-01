import java.util.Scanner;
public class ArthematicProgression {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A=s.nextInt();
		int D=s.nextInt();
		System.out.println(ap(A,N,D));
	}

	private static int ap(int a, int n, int d) {
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a;
			a=a+d;
		}
		
		return sum;
		
		
	}

}
