import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int rem,sum=0;
		while(n!=0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
