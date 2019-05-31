import java.util.Map;
import java.util.HashMap;
public class UniqueNumberinHashmap {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,1,3,2};
		
		Map<Integer, Integer> hm = new HashMap<>(); 
		
		for(int i:a) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}//end of if
			
			else
			{
				hm.put(i, 1);
			}//end of else
			
		}//end of for
		for(Map.Entry <Integer, Integer> m:hm.entrySet()){    
	          // System.out.println(m.getKey()+" "+m.getValue());
	         int value = (int) m.getValue();
	           if (value>=2) {
	        	   System.out.println(m.getKey()+" is appearing "+m.getValue()+" times");
	           }
	           else {
	        	   System.out.println(m.getKey()+" is unique");
	           }
	           
	          } //end of for
		
		
	}//end of main

}
