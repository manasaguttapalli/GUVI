import java.util.Scanner;
public class ArrayMaxMin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		int min=a[0];
		for(int n=0;n<a.length;n++){
			if(min>a[n]){
				min=a[n];
				}
			}
			System.out.print(min+" ");
			int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
			System.out.println(max);
			
			

		}

	}
