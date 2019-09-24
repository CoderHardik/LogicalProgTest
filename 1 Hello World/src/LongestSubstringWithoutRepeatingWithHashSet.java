import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingWithHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = s.nextLine();
		
		int max_length=0;
		int i=0, j=0;
		
		Set<Character> hs = new HashSet<>();
		
		while(j<st.length()) {
			if(!hs.contains(st.charAt(j))) { // if not in hs then add otherwise remove
				hs.add(st.charAt(j));
				j++;
				
				max_length=Math.max(max_length, j-i);
			}//end of if
			
			else {
				hs.remove(st.charAt(i)); 
				i++; // in case of 'abcabc' at 4th char when it is a it will see that a is there in hs so it will remove and thus a was first char, it will add i. that way i is keeping track of repeating counter
			}//end of else
		}//end of while
		
		System.out.println(max_length);
		System.out.println(hs);
		
		s.close();
	}//end of main

}
