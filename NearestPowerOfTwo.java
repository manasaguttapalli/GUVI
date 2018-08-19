import java.util.Scanner;
public class NearestPowerOfTwo {
	static int nextPowerOf2(int n)
    {
        int count = 0;
 
        while(n != 0)
        {
            n >>= 1;
            count += 1;
        }
 
        return 1 << count;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(nextPowerOf2(n));
		

	}

}
