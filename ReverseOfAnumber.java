import java.util.Scanner;
public class ReverseofANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int rem;
		while(num!=0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
