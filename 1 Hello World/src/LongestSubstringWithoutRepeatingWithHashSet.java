import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/*
* Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3.
sliding window algorith
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
*/

public class LongestSubstringWithoutRepeatingWithHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String st = "abcabcbb";
		
		int max_length=0;
		int i=0, j=0;
		
		Set<Character> hs = new HashSet<>();
		
		while(j<st.length()) {
			
			if(!hs.contains(st.charAt(j))) { // if not in hs then add otherwise remove
				hs.add(st.charAt(j));
				j++;
				max_length=Math.max(max_length, hs.size());
			}
			
			else {
				hs.remove(st.charAt(i)); 
				i++; // in case of 'abcabc' at 4th char when it is 'a' it will see that 'a' is there in hs at first place so it will remove first char, and it will add a at ith pos so removing here will prevent that. Plus i is keeping track of repeating counter
			}
		}
		
		System.out.println(max_length);
		System.out.println(hs);
		
		
	}//end of main

}
