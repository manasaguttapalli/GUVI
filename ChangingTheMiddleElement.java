import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class ChangeingMiddleElement {

	public static void main(String[] args) {
		 String b;
	        Scanner s=new Scanner(System.in);
	        b=s.next();
	       int y= b.length();
	       int u=y/2;
	       char t[]=b.toCharArray();
	       for(int i=1;i<b.length();i++){
	         if(i==u && b.length()%2==0){
	             t[u]='*';
	             t[u-1]='*';
	         }else if (i==u){
	        	 t[u]='*';
	         }
	       }
	      for(int i=0;i<t.length;i++){
	          System.out.print(t[i]);
	      }

	}

}
