import java.util.HashMap;
import java.util.Map;


public class UniqueHashmap {

	public static void main(String[] args) {
		String str []= {"Java","is","prog","Java"};
	
		Map<String, Integer> hm = new HashMap<String, Integer>(); 
		
		for(String s: str) {
			
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}//end of if
			
			else {
				hm.put(s, 1);
			}
		}//end of for
	
		hm.forEach((word, rep)->System.out.println("number -"+word+"- is repeated "+rep));
		
	}//end of main

}//end of class
