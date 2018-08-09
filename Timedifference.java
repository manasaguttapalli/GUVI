import java.util.Scanner;
public class TimeDifference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sumhrs;
		int summin;
		int hours=s.nextInt();
		int minutes=s.nextInt();
		int nexthr=s.nextInt();
		int nextmin=s.nextInt();

		if(hours>nexthr){
			 sumhrs=hours-nexthr;}
			else{
				 sumhrs=nexthr-hours;
			}
		if(minutes>nextmin){
			 summin=minutes-nextmin;
			 }
			else{
				 summin=nextmin-minutes;
			}
		System.out.println(sumhrs+" "+summin);
	}

}
