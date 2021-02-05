import java.util.HashMap;
import java.util.Map;

/* Dynamic Programming logic:
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
 */




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
			n = Math.min(n, s.length());

		for(int i = 0; i < n; i++){

			char curr = strs[0].charAt(i);

			for(int j = 0; j < strs.length; j++)
				if(curr != strs[j].charAt(i))
					return sb.toString();

			sb.append(curr); //in case of string  append using Strign st +=  curr;
		}
		return sb.toString();
	}
	
}

