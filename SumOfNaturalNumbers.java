import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0,i=1;
		int n=s.nextInt();
		while(i<=n){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
