import java.util.Scanner;
public class MultiplesOSeven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%7==0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
