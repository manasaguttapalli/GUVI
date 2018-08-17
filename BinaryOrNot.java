import java.util.Scanner;
public class BinaryOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='0'||str.charAt(i)=='1'){
			count=0;

			}else{
				count++;
			}
		}
		if(count>=1){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}
	}
}
