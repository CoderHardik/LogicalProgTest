import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumberWhileloop {

	public static void main(String[] args) {
		
		int n;
		int counter=1;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter size of array - number of elements you want to enter: ");
		n = s.nextInt();
		
		int a[]= new int[n];
		for (int i=0; i<n ; i++) {
			System.out.println("Enter number for element: "+i);
			a[i] = s.nextInt();
		}//end of array creation
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			while(i<a.length-1 && a[i]==a[i+1]) {
				counter++;
				i++;
			}//end of while
			if(counter==1) {
				System.out.println("Number "+a[i]+" is unique");
			}
			else
		System.out.println("This element "+a[i]+" is repeated: "+counter);
		counter=1;
		}//end of for

		s.close();
	}//end of main

}
