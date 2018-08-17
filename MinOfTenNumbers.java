import java.util.Scanner;
public class minimumOfTenNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int max;
		int a[]=new int[10];
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<a.length;i++){
			
			if(max>a[i]){
				max=a[i];
			}
		}
		System.out.print(max);
	}

}
