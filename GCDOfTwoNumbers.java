import java.util.Scanner;
public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1 = s.nextInt(), n2 = s.nextInt(), gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.print(gcd);
    }
}
