import java.util.HashMap;
import java.util.Map;

public class PrintHashMapwithLambda {

	public static void main(String[] args) {
		Map <String, Integer> hm = new HashMap<>();
		
		hm.put("Hardik", 23);
		hm.put("Shweta", 32);
		hm.put("Ishu my little angel", 1);
		
		hm.forEach((name,age)->System.out.println("Name is: "+name+ "and age is: "+age));
		
	}

}
