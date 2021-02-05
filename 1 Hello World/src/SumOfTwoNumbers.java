import java.util.HashMap;
import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
	
	
		int sum = 5;
		int count=0;
		for (int i=0; i<a.length ; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("Sum of numbers "+a[i]+" and "+a[j]+" is equal to: "+sum);
					count=count+1;
				}// end of if
				
			}//end of j
			
		}// end of i
		System.out.println("count of pairs that equals to sum :"+count);
		
	}// end of main
	
	
	
	// ** Following method if for program where you get 2 arrays to find paurs.
	
	public static void findPairs(int arr1[], int arr2[], 
            int n, int m, int x) 
{ 
// Insert all elements of first array in a hash 
HashMap<Integer, Integer> s = new HashMap<Integer, Integer>(); 

	for (int i = 0; i < n; i++) 
		s.put(arr1[i], 0); 

// Subtract sum from second array elements one 
// by one and check it's present in array first 
// or not 
	for (int j = 0; j < m; j++) 
		if (s.containsKey(x - arr2[j])) 
			System.out.println(x - arr2[j] + " " + arr2[j]); 
} 
	

}
