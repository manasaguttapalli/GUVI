import java.util.Scanner;
public class MinutesIntoHours {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int hours = t / 60; 
		int minutes = t % 60;
		System.out.println(hours+" "+minutes);

	}

}
