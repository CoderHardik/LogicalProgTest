
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	
	// Complexity of binary search is T(n) = o(log n)

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter num you want to check: ");
		int num= s.nextInt();
		int arr[]= {1,2,8,9,12};  // binary search works with sorted array so one has to either sort or implement only when sorted
	    
		int index= binSearch(arr, num);
		if (index == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + index); 
		s.close();
	}
	
	public static int binSearch(int arr[], int num) {
		int first=0;
		int last=arr.length-1;
		
		
		while(first<=last) {
			int mid= (first+last)/2;
			if(num>arr[mid]) {
				first=mid+1;
			}//end of if <-- Here same thing can be done by recursion, Call here for same function and pass first, last and mid parameter here.
			
			else if(num==arr[mid])
			{
				return mid;
			}//end of else if
			
			else
			{
				last=mid-1;
			}//end of else
			
		}//end of while
		
		return -1;
		
	}//end of bin search

}