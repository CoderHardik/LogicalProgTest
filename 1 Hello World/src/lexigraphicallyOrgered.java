import java.util.Scanner;
/*Problem statement:
 * We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

 */

public class lexigraphicallyOrgered {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));

	}
	
public static String getSmallestAndLargest(String s, int k) {
        
		String smallest = s.substring(0,k);
		String largest  = "";
		    for(int i=0;i<s.length()-k+1;i++){
		if(s.substring(i,i+k).compareTo(smallest) <0) {
		    smallest = s.substring(i,i+k);
		    }//end of if
		if(s.substring(i,i+k).compareTo(largest) >0) {
		largest = s.substring(i,i+k); 
		    }//end of if
		    }//end of for
		    
		return smallest+System.lineSeparator()+largest; 
		    }//end of method

}
