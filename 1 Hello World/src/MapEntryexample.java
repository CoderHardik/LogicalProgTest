import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryexample {

	public static void main(String[] args) {
		
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Hardik");
		hm.put(2, "Shweta");
		hm.put(3, "Ishaani");
		
		/*            A
		 * Step 1:
		 * We know that Set has inbuilt function of Iterator which will iterate through each index. Now Map has function of entryset that will 
		 * convert Map to Set. This set, each index will contain key and value pair. As I understand it will be partitioned inside it somehow. 
		 * In short, entryset is Set equivalent conversion of Map	and that is exactly what we are doing below
		*/
		Set st= hm.entrySet();
		
		/*Step 2:
		 * Below, since we have Set created in step 1, we are going to create iterator so we can iterate through each of indexes
		 * Observe here and above that we have not casted entryset or even Iterator. This will happen inside it.
		 * If we cast, in last step of defining Map.Entry - we will get error.
		 */
		Iterator it=st.iterator();
		
		
		/*Step 3:
		 * Now we are defining Map.Entry. This is necessary because you can not extract from each index of Set which is derived from Map.
		 * Here iterator in each index will not know what to extract since it is key value and you will get error.
		 * And since Map.Entry can figure out key value - We have to cast Iterator with it so it can extract key or value as per your 
		 * need so that is what we did below. Remember that we are casting it. 
		 */
		
	    while (it.hasNext()) {
		Map.Entry mp = (Map.Entry) it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	     }
		
		
		/*			B
		 * Another way to do this
		 */
		 for(Map.Entry m : hm.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }
		 
		 
		 // C Another way to do it
		 hm.forEach((key,name)->System.out.println("key is: "+key+ "and name is: "+name));
	}

}
