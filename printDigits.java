import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		for(int i=0;i<str.length();i++){
			if(i==n-1){
				System.out.print(str.charAt(i));
			}else{
			System.out.print(str.charAt(i)+" ");
			}
			
		}
		}

	}
