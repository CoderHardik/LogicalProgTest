import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InterviewHelp {
	
	
	
	/*-- method returning arrayList
	
	public ArrayList<Integer> myNumbers()    {
	}
	AND
	
	method accepting array in java
	public int min(int [] array) {
	
- (str.isEmpty()) to check if String is empty

- s.equals(s1) if you want to compare ()	

- when in for loop a[i+1], always have i=0, i<a.length-1 -- otherwise array out of bound
	
- isDigit method - Character.isDigit(char(c)) 

- Char to Int - Integer.parseInt(String.valueOf(s.charAt(n)));

- Char At starts with left most char in String

- When if then it is == for operator 

- String -> length()

- ARRAY -> length

- Integer can have negative value too.

- String to char array - s.toCharArray();

- hm.entrySet()  (not hm.EntrySet)

- hm.containsKey() - 

- mp.getKey()   (remember bracket)

- when converting arraylist to array return type is object - 

i.e. Object A[] = al.toArray()  --> Here arraylist return array of object
if need to use for loop then for(Object ob: A)   --> This is how you can use it

- For HashSet -> hs.add(a)  (and not hs.put())

- When you devide any number, make sure that number is not initialized as zero 

- Hex to decimal Integer.parseInt("a",16));
	

	
	*/
	
	
	public static void main(String[] args) {
	
		
		char[] master= {'a','b','c','d','e'};
		
		//1. ---------- Array list ------------
		
		// Array list initialization
		ArrayList<Character> m = new ArrayList<Character>();
		
		// Special for loop
		for(char c: master) {
			m.add(c);
		}
		
		
		//2. ----------   Hash Map ---------
		String text = "abbaabc"; 
        char[] c = text.toCharArray(); 
        char k='\0';
        int max_repeat=0;
        
        
        
        // ----Initialize Hash map----
		Map<Character, Integer> hm = new LinkedHashMap <Character, Integer>();
        
		
		
		// ---- Create hash map- with duplicate value scenario----
        for(char ch: c) {
        	if(hm.containsKey(ch)) {
        		hm.put(ch, (hm.get(ch)+1));
        		max_repeat = hm.get(ch);
        	}
        	
        	else {
        		hm.put(ch, 1);
        	}
        	
        }
        
        // ---Print hash map---
        hm.forEach((character, repeated_times)->System.out.println(character+" Character repeated "+repeated_times));
        hm.forEach(
                (character, v) -> {
                    // yes, we can put logic here
                    if (character != null){
                    	
                        System.out.println("Key : " + character + ", Value : " + v);
                    }
                }
            );
	
        
        //----Run iterator with Map.entry ---
        for(Map.Entry<Character, Integer> mp: hm.entrySet()) {
        	
        	if(mp.getValue()==max_repeat) {
        		k=mp.getKey();
        		break;
        	}//end of if
        }//end of for 
        
        
        
        // --Convert Int to String without Parse Int --
        int base = 3;
    	String st = ""+base;
    	System.out.println(st);
    	
    	
    	// -- Concert String or char to int
    	char d='1';  
    	int ag=Integer.parseInt(String.valueOf(d));
    	
    	
    	// -- length vs length()
    	int a = c.length; //for array use legth
    	int b = st.length(); //for string use .length()
    	
    	
    	
		
	}//main ends

	
	
}
