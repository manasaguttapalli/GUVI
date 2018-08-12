import java.util.Scanner;
public class SpecialCharectersInString {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int count=0;
	String str=s.nextLine();
	for(int i=0;i<str.length();i++){

		if(str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
			continue;
		}
		else{
			count++;
		}
	
	}
	System.out.println(count);
}

}
