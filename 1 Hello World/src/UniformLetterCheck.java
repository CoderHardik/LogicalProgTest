import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*You can code any of the following questions in any language that is in your comfort zone.
You can change the arguments of the functions to fit your needs.
Please also state the big-O notation of runtime of your algorithms.

1. Let the letters a-z have the attached values being as follows:
a = 1
b = 2
....
z = 26
Let the term 'uniform string' be represented as a string consisting of a single character repeated zero or more times. 
Example: 'aaa' or 'a' is a uniform string but 'aba' or 'ab' is not.
Given a string of letters and an array of targeted values. 
If a contiguous uniform substring of the input string with a sum of the targeted values exists, return an array or comma separate string with a true or false.

Assumptions:
targeted_values will never be null or empty
targeted_values will only have distinct values
num_targets will always be length of targeted_values and > 0 
input will only contains letters a-z and no other characters.

public bool[] contains_targeted_values(string input, int [] targeted_values, int num_targets){
    …
}

Example:
input = abbccaadf
targeted_values = [4,2,5,3,7] 
num_targets = 5

Result: 
[true,true,false,true,false] or 'true,true,false,true,false'
Explanation:
a - 1
b - 2
bb - 4
c - 3
cc - 6
a - 1
aa - 2
d - 4
f – 6


 * 
 * Example:
input = abbccaadf
targeted_values = [4,2,5,3,7] 
num_targets = 5
 */
public class UniformLetterCheck {

	public static void main(String[] args) {
		
		String input = "abbccaadf";
		int targeted_values[] = {4,2,5,3,7};
		
		contains_targeted_values(input, targeted_values);
		
	}//end of main
	
	public static List<Integer> letterNumberCreation(String input) {
		
		List<String> ls = new ArrayList<>();
		
		String st="";
		// Initial problem was that in if we will get string but in else will get char so
		// Thought of using string builder but it will keep on appending
		// so Best way to use is use char and convert to string
		for(int i=0; i<input.length(); i++) {
			
			char c= input.charAt(i);
			
			String s = String.valueOf(c);
			while (ls.contains(s)) {
				s=s+c;
			}//end of while
			
			ls.add(s);
		}//end of for
		ls.forEach(s->System.out.println(s));
		return resultStringtoNum(ls);
		
	}//end
	
	public static int lettertoNumberConversion(char s) {
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', 1);
		hm.put('b', 2);
		hm.put('c', 3);
		hm.put('d', 4);
		hm.put('e', 5);
		hm.put('f', 6);
		
		return hm.get(s);
	}//end of method
	
	public static List<Integer> resultStringtoNum(List<String> ls) {
		
		List <Integer> intlist = new ArrayList<>();
		int temp=0; int fin=0;
		for(String s:ls) {
			
				temp= lettertoNumberConversion(s.charAt(0));
				fin = temp *s.length();
				intlist.add(fin);
		}//end of for
		return intlist;
		
	}//end of method
	
	public static void contains_targeted_values(String s, int targeted_values[]) {
		List<Integer> intlist = new ArrayList<>();
		
		intlist= letterNumberCreation(s);
		
		List<Boolean> res = new ArrayList<>();
		
		for (int i=0; i<targeted_values.length; i++) {
			boolean b = intlist.contains(targeted_values[i]);
			res.add(b);
		}//end of for
		
		res.forEach(st->System.out.println(st));
		
	}//end of method
		
	

}
