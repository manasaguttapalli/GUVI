import java.util.Scanner;
public class NoOfCharecters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
				int num=0;
				for(int i=0;i<str.length();i++){
					if(str.charAt(i)==' '){
						continue;
					}
					num++;
				}
		
				System.out.println(num);
	}

}