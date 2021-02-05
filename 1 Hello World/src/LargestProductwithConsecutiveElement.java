
/* Given an array, find the largest product of two consecutive elements.
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/
 */

public class LargestProductwithConsecutiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int highestnum(int A[]){

	    	int res=0;
	    	for(int i=0; i<A.length-1; i++){    // Main thing is to just have i<A.length-1 here i<A.length will be out of bound as A[i+1]
	    		if(res<(A[i]*A[i+1])){
	    		res = A[i]*A[i+1];				
	    	}	

	    		}

	    	return res;
	    	}//end of method

}
