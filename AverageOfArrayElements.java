import java.util.Scanner;
public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int N=s.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		for(int j=0;j<N;j++){
			 sum=a[j]+sum;
		}
		int average=sum/N;
		System.out.println(average);
	}

}
