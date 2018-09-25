import java.util.Scanner;
public class EvenInOddPlaces {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char temp;
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i=i+2){
			temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
			
			
		}
		for(int i=0;i<str.length();i++){
System.out.print(ch[i]);
}
	}

}
