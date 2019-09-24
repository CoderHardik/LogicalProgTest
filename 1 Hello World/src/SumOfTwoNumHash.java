import java.util.HashMap;

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
		pair (a , sum);
		
		s.close();
	}//end of main
	
	
	public static void pair(int a[], int sum) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 //logic is to check if  temp=sum-i. Also one trick that any program that is replacing another for loop is usually by having one for loop 
		 // and in that checking if hash map(containsKey) or set(contains) method
		 int count =0;
		 
		 for (int i=0; i<a.length; i++){ 
              
	            // initializing value to 0, if key not found 
	            if(!map.containsKey(a[i])) 
	                map.put(a[i],0); 
	                  
	            map.put(a[i], map.get(a[i])+1); 
	        } 
		 
		 for (int i=0; i<a.length;i++) {
			if (map.get(sum-a[i])!=null) {
				System.out.println("Pair found " +(sum - a[i]) + " and " + a[i]);
				
				count=count+map.get(sum-a[i]);
			}// if
			
			map.put(i, a[i]);
			
		 }//end of for
		 
		 if (count==0) {
			 System.out.println("No pair found");
		 }
	}//end of pair
}//end of class
