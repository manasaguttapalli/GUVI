import java.util.Scanner;
public class SimpleAP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int D=s.nextInt();
		int N=s.nextInt();
		System.out.println(ap(A,D,N));
	}

	private static int ap(int a, int d, int n) {
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a;
			a=a+d;
		}
		
		return sum;
		
		
	}
	}
