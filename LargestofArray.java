import java.util.Scanner;
public class LargestOfArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int max;
		int N=s.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<N;i++){
			
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.print(max);
	}

}
