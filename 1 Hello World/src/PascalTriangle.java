import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Example:

Input: 6
Output:
[
      [1],
     [1,1],
    [1,2,1],
   [1,3,3,1],
  [1,4,6,4,1]
 [1,5,10,10,5,1] 
 
]
This is based on binomial theorem - 

C(line, i)   = line! / ( (line-i)! * i! )
C(line, i-1) = line! / ( (line - i + 1)! * (i-1)! )
We can derive following expression from above two expressions.
C(line, i) = C(line, i-1) * (line - i + 1) / i

So in nutshell,  C = C * (line - i) / i;   


This solution is to simply print the pascal triangle
 */
public class PascalTriangle {

	public static void main(String[] args) {
		createArray(6);
	}//end of main
	
	public static void createArray(int n) {
		
		for (int j=1; j<n ; j++) {
			int c=1;
			 for (int i=n-j; i>1; i--) 
	            { 
	                System.out.print(" "); // printing spaces 
	            }
			
		for(int i=1; i<=j ; i++) {
			System.out.print(" "+c); //(" *");
			c=c*(j-i)/i;
		}//end of for
		
		System.out.println();
		}//end of for 2
	}//end of method

}
