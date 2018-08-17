import java.util.Scanner;
public class SumEvenOrOdd {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	int M=s.nextInt();
	int sum=M+N;
	if(sum%2==0){
		System.out.println("even");
	}else{
		System.out.println("odd");
	}

	}

}
