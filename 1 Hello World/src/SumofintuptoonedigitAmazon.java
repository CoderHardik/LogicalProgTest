/* Given an integer, find sum of digits of that number until sum becomes single digit
 * a=199 --> 1+9+9 -->19 --> 10 --> 1
 * a=256 --> 2+5+6 --> 13 ->> 1+3 --> 4
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/

Dry Run: Digit Sum Logic
Input: n = 123, temp = 0
Pass	Loop Condition	if (n == 0) Check	Math Operations	Current n	Current temp
Start	—	—	Initial Values	123	0
1	123 > 0 (True)	False (Skip)	temp = 0 + 3
n = 123 / 10	12	3
2	12 > 0 (True)	False (Skip)	temp = 3 + 2
n = 12 / 10	1	5
3	1 > 0 (True)	False (Skip)	temp = 5 + 1
n = 1 / 10	0	6
4	0 > 0 || 6 > 9	(False)	Loop Terminates	0	6


 
 */

public class SumofintuptoonedigitAmazon {
	public static void main(String[] args) {
		int n=256;
    	int temp=0;
    	while(n>0|| temp>9) {
    		//at the end when n=0 then swap with temp so it can start loop again
    		if(n==0) {
    			n=temp;
    			temp=0;
    		}
    		
    		temp =temp+(n%10); 
    		n=n/10;
    	}
    	 
    	System.out.println(temp);
	    	
	    }//end of main
	    
	
	
	
	
	// With recurssion
	    public static int finalsum(int a) {
	    	if(a<10){
	    	return  a;	
	    }	

	    else{
	    	a= (a/10)+(a%10);
	    	return finalsum(a);
	    }

	    }

}
