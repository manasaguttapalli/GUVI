import java.util.Scanner;
import java.util.HashMap;
public class Isomorphic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		if(isIsomorphic(str1,str2)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
		public static boolean isIsomorphic(String s, String t) {
		    if(s==null||t==null)
		        return false;
		 
		    if(s.length()!=t.length())
		        return false;
		 
		    HashMap<Character, Character> map = new HashMap<Character, Character>();
		 
		 
		    for(int i=0; i<s.length(); i++){
		        char c1 = s.charAt(i);
		        char c2 = t.charAt(i);
		 
		        if(map.containsKey(c1)){
		            if(map.get(c1)!=c2)
		                return false;
		        }else{
		            if(map.containsValue(c2)) 
		                return false;
		            map.put(c1, c2);
		        }
		    }
		 
		    return true;
		}

	}
