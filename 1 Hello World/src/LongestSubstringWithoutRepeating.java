import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {
/*
 * Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Source: https://www.youtube.com/watch?v=8FDMiWQijpo

Not Fully working output of following is not correct. Please look into it.. Check one with Hashset which is working fine

Enter String: 
ABBBACBSDBA
Result is 5
String is: ABBBA
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = s.nextLine();
		int start_of_substring=0, max_len=0;
		char[] ch = st.toCharArray();
		String res = "";
		Map<Character,Integer> hm = new HashMap<>();
		
		for (int i=0; i<ch.length; i++) {
			char currentchar = ch[i];
			
			if(hm.containsKey(currentchar) && hm.get(currentchar)>=start_of_substring) {
				start_of_substring = hm.get(currentchar)+1;  //pointer start at zero so plus one
				
				/* Explaination : Here take 'A' 'B' 'B' 'A' for example
				 * for first 2 chars, A and B, it will not update start of substring coz they are not repeating.. so hm.containsKey(currentchar) is false
				 * When 2nd 'B' appears, now it is in map so 1st cond is fulfilled. get(B) = 1 since previous B is at 1 and start_of.. is 0 as no char got repeated till now so now it will pass and start of.. will be 1+1 =2 
				 * Now  when last A appears in map, map contains so that condition is fine but last A index was 0 and start of sub is 2 so second condition not fulfilled so no change
				 * That is logic, update only last repeating index and start of substring start there. If even last char was B then it would have gotten updated 
				 */
				
			
			}//end of if
			
			hm.put(currentchar, i);
			
			max_len = Math.max(max_len,i-start_of_substring+1);
			/*This condition with max between 2 coz
			*If when there is substring after start_of_substring (ex -ABBA) then second part will be max and will be fine
			*But when there is no substring after start_of_substring index (ABBB, here start of sub will be 3 means last B and there is nothing after that), so here first max_length will be 2 which happened during first 2 loops and which will be your result
			*
			*/
			  if(max_len>i-start_of_substring+1) {
				  res =st.substring(0, max_len);
			  }
			  
			  else {
				  res = st.substring(max_len, st.length());
			  }
		}//end of for
		
		
		System.out.println("Result is "+max_len);
		System.out.println("String is: "+res);
		
		s.close();
	}//end of main

}// end of class
