import java.util.Scanner;
public class EvenOddPositionsInString {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String even ="";
		String odd="";
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				even+=str.charAt(i);
			}else{
				odd+=str.charAt(i);
			}
		}
		System.out.println(even+" "+odd);
	}

}
