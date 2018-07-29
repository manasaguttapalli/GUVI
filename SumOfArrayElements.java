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
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
		System.out.print("\n"+total);

	}

}
