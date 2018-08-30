import java.util.Scanner;
public class AreaUpto5Digits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a*b;
		System.out.format("%.5f",c);
	}
	
}
