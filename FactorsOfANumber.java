import java.util.Scanner;
public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				l=1;
				if(i==n){
				System.out.print(i);
			}else{
				System.out.print(i+" ");
				}
			}
		}

	}
}
