import java.util.Scanner;
public class PrimesBwnIntervals {
	public static void main(String args[])
    {
         int s1, s2, s3, i, j;
         Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
         for(i=a+1;i<b;i++)
         {
         int c=0;
           for(j=2;j<=i/2;j++)
            {
              if(i%j==0)
              {
                 c++;
                 break;
               }
             }
         if(c==0)
         {
           System.out.print(i+" ");
           
         }
       }
    }
}
