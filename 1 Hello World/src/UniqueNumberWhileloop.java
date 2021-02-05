import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumberWhileloop {

	public static void main(String[] args) {
		
		int n;
		int counter=1;
		int a[]= {1,2,3,4,5};
		
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

		
	}//end of main

}
