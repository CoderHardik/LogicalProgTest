
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
 */

public class StaircaseProblemWithfibonachi {

	public static void main(String[] args) {
		
		int res = totalWays(5);
		System.out.println("Total number of ways for step: "+res);
	}//end of main
	
	
	// This is not space optimized. Complexity here is T(n) = T(n-1) + T(n-2)
	public static int fib(int n) {
		
		if(n<=1) {
			return n;
		}//end of if
		
		else {
			return fib(n-1)+fib(n-2);
		}
	}//end of fib
	
	public static int totalWays(int s) {
		return fib(s+1); // S+1 because step will be always +1. i.e if steps are 3, then stairs it takes are 4. ref : https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
		
	}//end

//This is more efficient method compared to recursive. here complexity is O(n)	
	
	public static int fibo(int n){
	    
	    /* Declare an array to store Fibonacci numbers. */
	    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
	    int i; 
	       
	    /* 0th and 1st number of the series are 0 and 1*/
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	       /* Add the previous 2 numbers in the series 
	         and store it */
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n]; 
	  
	    }
	
}//end of class
