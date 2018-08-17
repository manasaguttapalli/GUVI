import java.util.Scanner;
public class NoOfoccurances {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int count=0;
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(M==a[i]){
				 count++;
			}
		}
	if(count>=1){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	}	
}
