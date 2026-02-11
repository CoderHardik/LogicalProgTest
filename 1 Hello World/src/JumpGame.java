

/*Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

The Scenario
Each number in the array represents the power of your legs at that specific stone.
It tells you the maximum distance you can jump from that spot.
You start at the first stone (index 0).
Your goal is to reach the very last stone (the last index).


Example 1:
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.

Visual Example 1: [2, 3, 1, 1, 4] (Possible)
Start at Stone 0: It has a 2. You can jump to Stone 1 or Stone 2.
Jump to Stone 1: It has a 3. From here, you can jump up to 3 steps.
Final Jump: Since Stone 1 allows a 3-step jump, you can leap directly to the last stone (4).
Result: ✅ Success!
Visual Example 2: [3, 2, 1, 0, 4] (Impossible)
Start at Stone 0: It has a 3. You can jump to Stone 1, 2, or 3.
The Trap: Notice Stone 3 has a 0


			 
In short, start with A[0] and then whatever the value at A[0] (assume temp) becomes A[temp] in next 
so temp=0
temp = A[temp]
if A[temp] =0 then break else keep going
 * 

 Main Logic to remember:

for (int i=0 ; I<a.length-1; I++){
if (Farthest<i) return false;
farthest = Mathmax(farthest, i+A[i]);
if (farthest>=A.length-1) return true;

 */
public class JumpGame {

	public static void main(String[] args) {
		
		int[] test1 = {2, 3, 1, 1, 4};
        System.out.println("Test 1 Result: " + canJump(test1)); // Expected: true
	}//end of main
	
	
	static boolean jumpgame(int A[]){
		int farthest = 0;
    for (int i = 0; i < A.length; i++) {
        // If the current index is greater than the farthest we can reach, we're stuck
        if (i > farthest) return false;
        
        // Update the farthest point reachable
        farthest = Math.max(farthest, i + A[i]);
        
        // If we can already reach the end, we're done
        if (farthest >= A.length - 1) return true;
    }
    return false;

		}//end of method

}//end of class
