import java.util.Scanner;
public class HadVowelOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			count=1;
		}
		}
		if(count>0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
