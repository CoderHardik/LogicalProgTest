import java.util.Scanner;

public class TwoMaxnumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter length of array: ");
		n=s.nextInt();
		
		int a[] =new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter element: ");
			a[i]=s.nextInt();
		}//end of for
		
		int max=0, sec_max=0;
		
		for(int i=0; i<n; i++) {
			if(max<a[i]) {
				sec_max=max;
				max=a[i];
			}
			else if(sec_max<a[i]) {       //  <-- This condition is important because last element can be second max but not max and only this line can catch it
				sec_max=a[i];
			}
		}// end of for
		
	System.out.println("Maximum number in given array is: "+max+" and second maximum is: "+sec_max);	
	s.close();
	}// end of main

	
}
