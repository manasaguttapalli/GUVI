import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%10==0){
			System.out.println(n);
		}else{
		int a = (n / 10) * 10;
		int b = a + 10;
		System.out.println(b);
			
		}
		
	}
}
