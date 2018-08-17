import java.util.Scanner;
public class FirstKCharOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int N=s.nextInt();
		if(N>str.length()){
			System.out.println("Int value out of bounds");
		}else{
		for(int i=0;i<N;i++){
			System.out.print(str.charAt(i));
		}
		}
	}

}
