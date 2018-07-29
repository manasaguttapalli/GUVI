import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int total=0;
		int a[]=new int[N];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<K;i++){
			total=total+a[i];
		}
		System.out.print(total);

	}

}
