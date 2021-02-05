

/*Given a string containing alphanumeric characters. Find the sum of the numbers in that string.
Input:- aa123bb4
Output:- 127

Input:- bbb5cc5dd12
Output:- 22
 * https://www.geeksforgeeks.org/amazon-qa-role-support-engineer-intern-interview-experience/
 * 
 * Logic:
 * Check whole string
1. Check if char is digit
2. Check if my temp is digit then continue until next char

Pointer:
- isDigit
- Char to Int
- Char At starts with left most char in String
- When if it is == for operator
- String -> length()
- ARRAY -> length
 */
public class SumFromAlphanumericAmazon {
	
	 public static void main(String[] args) {
		   String s = "aa123bb4";
		    int res = findSum(s);
		    System.out.println(res);
		    }//end of main
		    
		    
		    
		    
		    
	 public static int findSum(String str) 
	    { 
	        
	        String temp = "0"; 
	        int sum = 0; 
	         
	        for (int i = 0; i < str.length(); i++) { 
	            char ch = str.charAt(i); 
	            
	            if (Character.isDigit(ch)) 
	                temp += ch; 

	            else { 
	                sum += Integer.parseInt(temp); 
	                temp = "0"; 
	            } 
	        }
	        return sum + Integer.parseInt(temp); 
	    } 
}
