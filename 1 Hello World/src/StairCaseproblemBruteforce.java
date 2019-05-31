
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
