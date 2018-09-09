import java.util.Scanner;
public class PrintingKofNnumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int a[]=new int[N];
		for(int i=1;i<N;i++){
			a[i]=s.nextInt();
		}
		System.out.println(a[K]);
			
		}

	}
