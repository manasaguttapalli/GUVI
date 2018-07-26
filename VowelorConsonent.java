import java.util.Scanner;
public class VowelorConsonent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			System.out.println("Vowel");
		}
		else if(c>='a' && c<='z'){
			System.out.println("Consonent");
		}
		else{
			System.out.println("invalid");
		}

	}

}
