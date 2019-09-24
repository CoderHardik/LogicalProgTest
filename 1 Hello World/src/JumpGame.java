

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
		
		int [] A = {1,3,1,4,1};
		int index=0;
		int res=0;
		while(index<=(A.length-1) && index+A[index]<A.length) {
			//Above, have to detect second condition otherwise it will always go out of bound
			index = index+A[index]; //initially thought index =a[index] but that doesnt work
			
			if(index+A[index]==(A.length-1)) { 
				//Above I tried index == (A.length-1) but that will go up to last step. 
				//Here I have to detect last index and element at that index sum is equal to length and that is main logic
				res=1;
				break;
			}//end of if
			
			else if(A[index]==0) {
				res=2; //System.out.println("Jump game is stuck");
				break;
			}
			
		}//end of while
		
		if(res==1) {
			System.out.println("Valid array for jump game");
		}
		
		else if(res==0) {
			System.out.println("Invalid array for jump game");
		}

		else if(res==2) {
			System.out.println("Jump game is stuck");
		}


	}//end of main

}//end of class
