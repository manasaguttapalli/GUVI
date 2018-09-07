import java.util.Scanner;
public class Cubiod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		int w=s.nextInt();
		int tsa=2*((l*b)+(b*w)+(w*l));
		int volume=l*b*w;
		System.out.println(tsa+" "+volume);
		

	}

}
