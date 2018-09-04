import java.util.Scanner;
public class PrintNumbersInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				System.out.print(str.charAt(i));
			}
		}

	}

}
