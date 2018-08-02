import java.util.Arrays;
import java.util.Scanner;
public class MedianOfArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int median;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			median=n/2;
		if(i==median){
			System.out.print(a[i]);
		}
		}

	}
}
