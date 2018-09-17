import java.util.Scanner;
public class NthSmallestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int small=s.nextInt();
		int a[]=new int[N];
		int m=a[0];
		for(int i=1;i<N;i++){
			a[i]=s.nextInt();
		}
		int sort[]=new int[N];
		for(int i=1;i<N;i++){
			if(m<a[i]){
				m=a[i];
				sort[i]=m;
			}
		}
		System.out.println(sort[small]);

	}

}
