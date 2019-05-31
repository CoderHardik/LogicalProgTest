import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class IntersectionBetweenTwoArray {

	public static void main(String[] args) {
		
		int A[] = {2,1,2,1,2,3};
		int B[]= {4,1,1,1,2};

		Map<Integer, Integer> hmA = new HashMap<>();
		Map<Integer, Integer> hmB = new HashMap<>();
		
		for(int i=0; i<A.length; i++) {
			if(hmA.containsKey(A[i])) {
				hmA.put(A[i], hmA.get(A[i])+1);
			}//end of if
			else
			{
				hmA.put(A[i],1);
			}	
		}//end of for 1
		
		for(int j=0; j<B.length; j++) {
			if(hmB.containsKey(B[j])) {
				hmB.put(B[j], hmB.get(B[j])+1);
			}//end of if
			else
			{
				hmB.put(B[j],1);
			}
		}//end of for 2
		
		Map<Integer, Integer> hmC = new HashMap<>();
		
		for(int i=0; i< Math.min(A.length, B.length); i++) {
			if(hmA.containsKey(A[i]) && hmB.containsKey(B[i])) {
				hmC.put(A[i], Math.min(hmA.get(A[i]), hmB.get(B[i])));	
			}//end of if
		}//end of for
		
		List <Integer> l = new ArrayList<>();
		
		for (Map.Entry <Integer, Integer> m:hmC.entrySet()) {
			l = addArr( (int)m.getKey(), (int) m.getValue(), l);// iterate and add value by checking condition. to check condition, refer function
		}//end of for
		
		int[] result = new int[l.size()];
		int temp=0;
		
		for (int i: l) {
			result[temp]=i;
			temp++;
		}
		System.out.println(Arrays.toString(result));
	}//end main
	
	
	public static List<Integer> addArr(int key, int value, List<Integer> A) {
		int count=value;
		if(count==1) {
			A.add(key);
			return A;
		}
		else {
			A.add(key);
			value--;
			return addArr(key, value, A); // recusrsion to know how many times one item is repeating
		}
	}
	
	

}//end of class
