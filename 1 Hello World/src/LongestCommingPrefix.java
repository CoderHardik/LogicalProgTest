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

		if(strs.length < 1) return "";

		StringBuilder sb = new StringBuilder("");
		int n = Integer.MAX_VALUE;

		for(String s : strs)
			n = Math.min(n, s.length()); // smallest string length

		for(int i = 0; i < n; i++){

			char curr = strs[0].charAt(i); 
			
			//Remember, here strs[0] means it will take 1st element and it is not sorted. 
			//It does not matter what is the first string. It will start taking first character and compare with 

			for(int j = 0; j < strs.length; j++)
				if(curr != strs[j].charAt(i))
					return sb.toString();

			sb.append(curr); //in case of string  append using Strign st +=  curr;
		}
		return sb.toString();
	}
	
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
