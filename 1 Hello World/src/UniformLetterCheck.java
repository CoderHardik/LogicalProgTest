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
Let the term 'uniform string' be represented as a string consisting of a 
single character repeated zero or more times.
 
Example: 'aaa' or 'a' is a uniform string but 'aba' or 'ab' is not.
Given a string of letters and an array of targeted values. 
If a contiguous uniform substring of the input string with a sum of the targeted values exists, 
return an array or comma separate string with a true or false.

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

In short, check that each number of target value and one number of input conversion should make 
num_target
 */


public class UniformLetterCheck {
    public static void main(String[] args) {
        String input = "abbccaadf";
        int[] targetedValues = {4, 2, 5, 3, 7};
        
        boolean[] results = containsTargetedValues(input, targetedValues);
        System.out.println(Arrays.toString(results));
    }

    public static boolean[] containsTargetedValues(String input, int[] targets) {
        // Use a HashSet for O(1) lookups
        Set<Integer> weights = new HashSet<>();
        
        int currentWeight = 0;
        char prevChar = ' ';
        
        // Single pass O(n) to find all uniform substring weights
        for (char c : input.toCharArray()) {
            int charVal = c - 'a' + 1; // Calculate weight: a=1, b=2...
		//int charVal = c - 'a' + 1;
		//This is java shortcut which will check different between ASCII value
		//i.e. if char =a then  ‘a’ - ‘a’ +1 = 97-97+1  = 1
		//If char = b then ‘b’-‘a’+1 = 98-97+1  = 2
			
            if (c == prevChar) {
                currentWeight += charVal; // Add to existing uniform sequence (e.g., bb=4)
            } else {
                currentWeight = charVal;  // Start new uniform sequence
                prevChar = c;
            }
            weights.add(currentWeight);
        }

        // Check targets in O(m) time total
        boolean[] results = new boolean[targets.length];
        for (int i = 0; i < targets.length; i++) {
            results[i] = weights.contains(targets[i]);
        }
        return results;
    }
}

/*

-- End of method 2 --






Assumptions:
- Num is always greater than target value and input
- Input string contains small letters


Logic:
input[char]+target_values[i] = num_target


—
public bool[] contains_targeted_values(string input, int [] targeted_values, int num_targets){
 
char[] ip = input.toCharArray();

int[] B = new int[ip.length-1];
count=0;
for(char c: ip){
B[count] = Stringtorelavantvlues(c);
count++;
}//end of for
  
ArrayList<Integer> al_targeted_val = new ArrayList<>();
al_targeted_val = Arrays.asList(targeted_values);
temp=0;
bool[] result = new bool[targeted_values.length-1]

For (int I: B){
Int x = num_targets- B(temp);
if(al_targeted_val.contains(x)){
result[temp] = true;
}

Else
{
result[temp] = false;
}

temp++;
}//end of for

}



Int Stringtorelavantvlues(Character c){

HashMap <Character, Integer> stringtoval = new HashMap<>();
stringtoval.put(‘a’,1); // and so on

Return stringtoval.getKey(c);
}

 * 
 * 
 * 
 */
