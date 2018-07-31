import java.util.Scanner;
public class EvenNumbersIntervals {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int N=s.nextInt();
	 int Q=s.nextInt();
	 if(N==0 && Q==2){
		 System.out.println("no evens exist");
	 }
	 if(N==Q+1 || Q==N+1){
		 System.out.println("no even numbers exist");
	 }else{
	 if(N<Q){
	 for(int i=N+1;i<Q;i++){
		  if(i%2==0){
			 System.out.print(i+" ");
			 
		 }
	 }
	}else{
		for(int i=Q+1;i<N;i++){
			  if(i%2!=0){
				 System.out.print(i+" ");
			  }
		}
	

		}
	 
	 }
	}
}
