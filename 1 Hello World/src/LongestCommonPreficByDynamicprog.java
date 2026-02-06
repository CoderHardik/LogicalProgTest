
/* Dynamic Programming logic:
 * 
 * Remember diagonal solution from youtube. If prev diagonal had one then net will be 1+1
 * https://www.youtube.com/watch?v=BysNXJHzCEs&ab_channel=TusharRoy-CodingMadeSimple
 * 
 * if (st1[i]==st2[j])
 * 		T[i][j] = T[i-1][j-1]+1
 * else
 * 		T[i][j]=0
 * 
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/LongestCommonSubstring.java
 Dont get confused with line T[i][j] = T[i-1][j-1]+1 -- basically if i-1 and j-1 were 0 then it will add one. If it was 1 then it will add 2.
 Once I got confused as to how does it know if i-1 and j-1 had it detected but it stands correct even if it did not have it. It will just add 1.
 Imagine you are comparing "abc" and "xbc":
1. When you reach 'b' in both strings, the program looks at the previous characters ('a' and 'x'). Since 'a' and 'x' didn't match, T[i-1][j-1] was 0.
2. The program does 0 + 1, so T for 'b' becomes 1.
3. When it reaches 'c', it looks at the 'b' result (1) and does 1 + 1. Now the match length is 2.
 
 */

public class LongestCommonPreficByDynamicprog {

	 public static void main(String[] args) {
    	 
         char str1[] = "abcdef".toCharArray();
         char str2[] = "zcdemf".toCharArray();
         System.out.println(longestCommonSubstring(str1, str2));
    	
    }//end of main 
	 
	 public static int longestCommonSubstring(char str1[], char str2[]){
	        int T[][] = new int[str1.length+1][str2.length+1];
	        
	        int max = 0;
	        for(int i=1; i <= str1.length; i++){
	            for(int j=1; j <= str2.length; j++){
	                if(str1[i-1] == str2[j-1]){
	                    T[i][j] = T[i-1][j-1] +1;
	                    
	                    if(max < T[i][j]){
	                        max = T[i][j];
	                        System.out.println(str2[j-1]);
	                    }
	                }
	            }
	        }
	        return max;
	    }
}
