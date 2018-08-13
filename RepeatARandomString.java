import java.util.Scanner;
public class RepeatARandomString {

	public static void main(String[] args) {
		int n;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		n=s.nextInt();
		if(n<=0){
			System.out.println("Invalid integer");
		}else{
		for(int i=0;i<n;i++){
			System.out.println(str);
			}
		}
	}

}
