
public class StaircaseProblemWithfibonachi {

	public static void main(String[] args) {
		
		int res = totalWays(5);
		
		System.out.println("Total number of ways for step: "+res);

	}//end of main
	
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

}
