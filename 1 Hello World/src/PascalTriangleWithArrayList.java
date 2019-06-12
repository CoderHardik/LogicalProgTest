import java.util.ArrayList;
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


This solution is by using array list.
 */

public class PascalTriangleWithArrayList {

	public static void main(String[] args) {
		createArrayList(6);

	}
	
	public static void createArrayList(int n) {
		
		
		ArrayList <ArrayList<Integer>> bls = new ArrayList<>();
		
		int c=1;
		
		for (int j=0; j<n ; j++) {
			
			ArrayList <Integer> ls = new ArrayList <>();	
		for(int i=0; i<j ; i++) {
			
			 if(i==0||i==j) {
				 ls.add(i, 1);
			 }//end of if
			
			 else {
				 
				 c=c*(j-i)/i; 
				 ls.add(i,c);	
			 }//end of else
			
		}//end of for
	
		 bls.add(j,ls);
		
		}//end of for 2
		
		for(List<Integer> l : bls) {
			
			System.out.println(l);
		}//end of for
		
		
		
	}//end of method
	
	

}
