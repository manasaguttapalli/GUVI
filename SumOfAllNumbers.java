import java.util.Scanner;
public class SumOfAllNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]= s.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=a[i]+sum;
		}
System.out.println(sum);
	}

}
