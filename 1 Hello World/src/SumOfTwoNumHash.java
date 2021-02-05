import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SumOfTwoNumHash {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter size of array - number of elements you want to enter: ");
		n = s.nextInt();
		
		int a[]= new int[n];
		for (int i=0; i<n ; i++) {
			System.out.println("Enter number for element: "+i);
			a[i] = s.nextInt();
		}//end of array creation 
		
		System.out.println("Enter number for which sum should be detected: ");
		int sum = s.nextInt();
		Sumofnumber (a , sum);
		
		s.close();
	}//end of main
	
	
	static void Sumofnumber(int A[], int num){

		Map<Integer, Integer> hm = new HashMap<>();
		int count=0;
		
		for(int a: A){
		hm.put(count, a);
		count++;
		}//end of for
		
		for (Map.Entry mp: hm.entrySet()) {
			System.out.println("Key "+mp.getKey()+" and value"+mp.getValue());
		}

		for(int i=0; i<A.length; i++){
		int temp = num - A[i];

		if(hm.containsValue(temp)){
		System.out.println("Values "+A[i]+" and " +temp+ " are the pair");
		}//end of if

		}//end of for

	}//end of method
	
	// To find pair from 2 different arrays, use following program
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
	
	
}//end of class
