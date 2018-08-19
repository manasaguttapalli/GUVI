import java.util.Scanner;
public class DiffEvenOrOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int diff=a-b;
		if(diff%2==0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}

	}

}
