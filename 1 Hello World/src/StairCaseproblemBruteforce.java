
/*
 * Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)


Approach: We can easily find the recursive nature in the above problem. The person can reach nth stair from either (n-1)th stair or from (n-2)th stair. Hence, for each stair n, we try to find out the number of ways to reach n-1th stair and n-2th stair and add them to give the answer for the nth stair. Therefore the expression for such an approach comes out to be :

ways(n) = ways(n-1) + ways(n-2)
The above expression is actually the expression for Fibonacci numbers, but there is one thing to notice, the value of ways(n) is equal to fibonacci(n+1).

ways(1) = fib(2) = 1
ways(2) = fib(3) = 2
ways(3) = fib(4) = 3
 * 
 */

public class StairCaseproblemBruteforce {

	
		public static void main(String [] args) {
			int res = climbStairs(5);
			System.out.println("Number ways you can reach steps are: "+res);
			
		}//main
	
	    public static int climbStairs(int n) {
	       return climb_Stairs(0, n);
	    }
	    public static int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        //System.out.println("One way is "+(i+1)+" and "+(i+2));
	        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n); // Here each end node shows answer so each result from original node is one way you can do it
	        
	             }

}
