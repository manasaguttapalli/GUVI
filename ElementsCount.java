import java.util.Scanner;
public class ElementsCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem,i=0;
		while(n!=0){
			n=n/10;
			i++;
		}
		System.out.println(i);
	}

}
