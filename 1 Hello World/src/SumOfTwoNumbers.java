import java.util.Scanner;

public class SumOfTwoNumbers {

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
		int count=0;
		for (int i=0; i<n-1 ; i++) {
			for (int j=i+1; j<n; j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("Sum of numbers "+a[i]+" and "+a[j]+" is equal to: "+sum);
					count=count+1;
				}// end of if
				
			}//end of j
			
		}// end of i
		
		System.out.println("count of pairs that equals to sum :"+count);
		
		s.close();
		
	}// end of main
	
	

}
