import java.util.Arrays;
import java.util.Scanner;

public class MoveEvenInFront {
//main thing is to have counter. fill one space and move counter to next
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
		
		
		//Logic
		int counter=0, temp=0;
		
		
		for (int i=0; i<n; i++) {
		
			if(a[i]%2==0){
				temp = a[i];
				a[i]=a[counter];
				a[counter]=temp;
				
				counter++;
			}//end of if	
			
		}//end of for
		
		System.out.println(Arrays.toString(a));
		
		s.close();
	}//end of main

}
