import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Write a program to print the first non-repeated char in a string. 
 * e.g. A string “Is it your first company” returns ‘u’.
 */
public class Unique_first_char {

	
	public static void main(String[] args) {
    	String s = "Is it your first companyI";
    	first_unique(s);
    	
    }//end of main 


    public static void first_unique(String s){
    	LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
    	
    	char ca[] = s.toCharArray();
    	
    	for(char c: ca) {
    		if(lhm.containsKey(c)) {
    			lhm.put(c, lhm.get(c)+1);
    		}
    		else {
    		lhm.put(c, 1);//else
    		}
    	}
    	
    	for(Map.Entry mp : lhm.entrySet()) {
    		if(mp.getValue().equals(1)) {
    			System.out.println(mp.getKey());
    			break;
    		}
    		
    	}
    	
    	
    } 
}
