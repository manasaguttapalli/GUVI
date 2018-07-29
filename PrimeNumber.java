import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		if(n<=0){
			System.out.println("invalid");
		}
		else if(n==1){
			System.out.println("no");
		}else if(n==2)
		{
			System.out.println("yes");
		}else {
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("no");
		}else{
			System.out.println("yes");
		}
		}
	}
	}
