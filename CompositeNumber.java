import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int count=0;
		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
