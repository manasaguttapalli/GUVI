import java.util.Scanner;
public class MultiplesOfThirteen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0){
			System.out.println("no");
		}
		else if(n%13==0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
