

/*Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Example 1:
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.

 * 
 */
public class JumpGame {

	public static void main(String[] args) {
		
		int [] A = {2,3,1,1,4};
		jumpgame(A);

	}//end of main
	
	
	static void jumpgame(int A[]){
		int count=0;

		while(count<(A.length-1)){
			if(A[count]==0){
				break;
			}
			else{
				count = A[count]+count;
			}
		}//end of while

		if(count == (A.length-1)){
			System.out.println("Array is candidate for jumpgame");
		}//end of if

		else{
			System.out.println("Array is not candidate for jumpgame");
		}//else

		}//end of method

}//end of class
