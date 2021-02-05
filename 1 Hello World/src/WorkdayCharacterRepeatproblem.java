import java.util.LinkedHashMap;
import java.util.Map;

/* input of program is string
 * String can contain anything in ASCII - a-z, A-Z, 0-9 and case matters
 * 
 * output should print character that is repeated maximum. 
 * If maximum character repeated are more than one than return one that comes first in string
 * 
 * e.x
 * String text = "abbbaacc"
 * o/p =a
 * 
 * because even though a and b repeated 3 times, here a appears first in string.
 */

public class WorkdayCharacterRepeatproblem {

	public static void main(String[] args) {
		String text = "ddddabbaabc"; 
        char[] c = text.toCharArray(); 
        char k='\0';
        int max_repeat=0;
        
        System.out.println(c);
        
        Map<Character, Integer> hm = new LinkedHashMap <Character, Integer>(); // linked hash map will retain insert order
        
        for(char ch: c) {
        	if(hm.containsKey(ch)) {
        		hm.put(ch, (hm.get(ch)+1));
        		max_repeat = hm.get(ch);
        	}
        	
        	else {
        		hm.put(ch, 1);
        	}
        	
        }//end of for
        
        hm.forEach((character, repeated_times)->System.out.println(character+" Character repeated "+repeated_times));
        
        System.out.println(max_repeat);
        
        for(Map.Entry<Character, Integer> m: hm.entrySet()) {
        	
        	if(m.getValue()==max_repeat) {
        		k=m.getKey();
        		break;
        	}//end of if
        }//end of for
        
        System.out.println(k);  

	}

}
