import java.util.Scanner;
public class RecursiveDivisionBy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0){
			if(n%2==0){
				n=n/2;
				}
			else{
				break;
			}
			}
		System.out.println(n);
	}
	}
