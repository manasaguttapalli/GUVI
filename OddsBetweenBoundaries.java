import java.util.Scanner;
public class oddNumbersIntervals {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int N=s.nextInt();
	 int Q=s.nextInt();
	 if(N==Q+1 || Q==N+1){
		 System.out.println("no odds exist");
	 }else{
	 if(N<Q){
	 for(int i=N+1;i<Q;i++){
		  if(i%2!=0){
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
