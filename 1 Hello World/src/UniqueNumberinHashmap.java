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
		
		hm.forEach((number, rep)->System.out.println("number "+number+" is repeated "+rep));
		
		
	}//end of main

}
