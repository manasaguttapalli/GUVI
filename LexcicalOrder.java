import java.util.Scanner;
public class LexographicalOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char temp;
		String str=s.nextLine();
		char[] a=str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	  }
		for(int i=0;i<str.length();i++){
			System.out.print(a[i]);
		}
	}

}
