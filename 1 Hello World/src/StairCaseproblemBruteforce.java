
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
 This is fibonacci series problem. Way to go to first step is 1 way, way to go 2nd step is 2 ways. Then after it will be addition of previous 2
i.e. 3rd step is = first + second. And then do it in loop as follows for further

  int first=1; // Ways to reach 1 step
  int second=2; // Ways to reach 2 steps
 */

public class StairCaseProblem {

    public static void main(String[] args) {
        int n = 5;
        int res = stairCase(n);
        System.out.println("Number of ways to reach " + n + " steps: " + res);
    }

    public static int stairCase(int n){
        if (n<=1) return 1;
        if (n==2) return 2;

        int first=1; // Ways to reach 1 step
        int second=2; // Ways to reach 2 steps
        int current=0;
        for(int i=3; i<=n; i++){
            current = first+second;
            first=second;
            second=current;
        }
        return second;
    }
    
}


/*
Dry Run: climbStairs(3)  

Level 0: The Root climb_Stairs(0, 3) calls:
climb_Stairs(1, 3) + climb_Stairs(2, 3) 

Level 1: Branching from Step 1 climb_Stairs(1, 3) calls:
climb_Stairs(2, 3) + climb_Stairs(3, 3) 
climb_Stairs(3, 3) returns 1 (Base Case: Success)
climb_Stairs(2, 3) calls:
climb_Stairs(3, 3) returns 1 (Base Case: Success).
climb_Stairs(4, 3) returns 0 (Base Case: Overshot).
Total for climb_Stairs(1, 3) = 1+1=2. 

Level 1: Branching from Step 2 climb_Stairs(2, 3) calls:
climb_Stairs(3, 3) returns 1 (Base Case: Success).
climb_Stairs(4, 3) returns 0 (Base Case: Overshot).
Total for climb_Stairs(2, 3) = \(1+0=1\). 

Final Calculation: Result = 2 (from step 1) + 1 (from step 2) = 3. Visualization for n = 5
*/
