import java.util.Scanner;
public class BitwisSwap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a=b^a;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);

	}

}
