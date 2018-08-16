import java.util.Scanner;
public class PowerOfTwo {
static boolean powerof(int n){
	if(n==0){
		return false;
	}
	while(n!=1){
		if(n%2!=0){
			return false;
			
		}
		n=n/2;
	}
	return true;	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(powerof(n)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		}
	}
