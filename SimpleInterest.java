import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int t=s.nextInt();
		int r=s.nextInt();
		if(p<0||t<0||r<0){
			System.out.println("negative values are not allowed");
		}
		else{
		int si=(p*t*r)/100;
		System.out.println(si);
		}
	}

}
