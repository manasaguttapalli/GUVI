import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int temp;
		temp=n;
		n=m;
		m=temp;
		System.out.println(n+" "+m);
				

	}

}
