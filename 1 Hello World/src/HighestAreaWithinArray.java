
public class HighestAreaWithinArray {

	public static void main(String[] args) {
		
		int A[]= {3,4,1,9,6,8,2};
		
		int first =0;
		int last=A.length-1;
		int height, breadth, Area, Max_Area=0;
		/*Logic is to start with first and last bar and check area for them. Store it and see which bar 
		 * has higher bar next to it. first or last
		 * move to that bar and check area between them. Once found, compare 
		 * previous and latest area consider highest between them and continue
		 */
		
		
		while(first<last) {
			
			 height = Math.min(A[first], A[last]); // min height between two bar
			 breadth = last - first; 
			 Area = height * breadth;
			 
			 Max_Area=Math.max(Max_Area, Area);
			 
			 if(A[first]> A[last]) {
				 last--;
			 }//end of if -- here also consider A[first] = A[last] --> last--. U can put any logic for ==
			 
			 else {
				 first++;
			 }//end of else
			
		}//end of while

		System.out.println("Max area here is: "+Max_Area);
		

	}//end of main

}//end of class
