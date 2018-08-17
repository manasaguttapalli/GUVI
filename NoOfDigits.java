import java.util.Scanner;
public class NoofDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
			count++;
		}
		}
		System.out.println(count);	
	}

}
