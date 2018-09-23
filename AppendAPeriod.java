import java.util.Scanner;
public class AppendAPeriod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++){
			if(i==n-1){
				str=str+".";
			}
		}
System.out.println(str);
	}

}
