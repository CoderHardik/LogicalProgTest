/* Given an integer, find sum of digits of that number until sum becomes single digit
 * a=199 --> 1+9+9 -->19 --> 10 --> 1
 * a=256 --> 2+5+6 --> 13 ->> 1+3 --> 4
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/
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
