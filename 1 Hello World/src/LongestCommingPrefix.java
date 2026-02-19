import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String strs[]= {"flower","flow","flight"};
        System.out.println(longcom(strs));
    }

    public static String longcom(String []s){

        if (s==null || s.length==0) return "";
        Arrays.sort(s); // Sort array

        String first = s[0];
        String last = s[s.length-1];
        int i=0;
        while (i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++; // i++ only when character between first and last match. Since alphabtical, only first few letters will match if
        }

        return first.substring(0,i);

    }
    
}



/*  
In terms of time complexity - method 2 is best for big numbers. Since above method has array sorting.
Method 2 - Time Complexity:  O(S)
Method 1- O(n.m.log n)


-- Method 2 -- 
public class LongestCommingPrefix {

	public static void main(String[] args) {
		
		String strs[]= {"flower","flow","flight"};
		String lcp =longestCommonPrefix(strs);
		System.out.println("LCP is: "+lcp);
	}

	public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";

    // Iterate through characters of the first string (horizontal movement)
    for (int i = 0; i < strs[0].length(); i++) {
        char curr = strs[0].charAt(i);

        // Check this character against all other strings (vertical movement)
        for (int j = 1; j < strs.length; j++) {
            // Kill Switch: If string is too short OR characters don't match
			// i == strs[j].length() -- will make sure we only go length of whichever has small length and then stop
            if (i == strs[j].length() || strs[j].charAt(i) != curr) {
                return strs[0].substring(0, i);
            }
        }
    }

    // If we finish the loops, the entire first string is the common prefix
    return strs[0];
}

Method 3

Dynamic Programming logic:
 * 
 * Remember diagonal solution from youtube. If prev diagonal had one then net will be 1+1
 * https://www.youtube.com/watch?v=BysNXJHzCEs&ab_channel=TusharRoy-CodingMadeSimple
 * 
 * if (st1[i]==st2[j])
 * 		T[i][j] = T[i-1][j-1]+1
 * else
 * 		T[i][j]=0
 * /**
     * Dynamic way of calculating lcs
     This is the way
    public int longestCommonSubstring(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];
        
        int max = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;
    }
 * 
 * 
Input: An array (or list) of strings (e.g., ["flower", "flow", "flight"]).
Output: A single string representing the longest shared prefix. If no common prefix exists, the output is an empty string ""
o/p- fl
 







 */
