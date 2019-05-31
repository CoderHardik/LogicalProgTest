import java.util.Scanner;
import java.util.Arrays;


public class BubbleSort {

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
		int temp;
		for(int i=0; i<n-1; i++) {
			
			for (int j=0 ; j<n-i-1; j++) {
				
				if (a[j]>a[j+1]) {
					temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}//end of if
				
			}//end of for
			
		}//end of i
		
		System.out.println(Arrays.toString(a));

		s.close();
	}

}
