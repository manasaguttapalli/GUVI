import java.util.Scanner;
public class NearestEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=N-1;
		if(N%2==0){
			System.out.println(N);
		}else{
		while(N!=0){
			if(M%2!=0){
				M=M-1;
			}else{
				break;
			}
		}
		System.out.println(M);
		}
	}
}
