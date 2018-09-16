import java.util.Scanner;
import java.math.*;
public class NpowerK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int result=(int) Math.pow(n, p);
		System.out.println(result);
		

	}

}
