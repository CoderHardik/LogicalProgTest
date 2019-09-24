import java.util.Arrays;
// time complexity - o(nlogn) for avg and o(n2) worst case , space complexity - in place sort
// in built sort is quick sort only



/* low  --> Starting index,  high  --> Ending index 
quickSort(arr[], low, high)
{
    if (low < high)
    {
         pi is partitioning index, arr[pi] is now
           at right place 
        pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
    
    //Reference - https://www.interviewbit.com/tutorial/merge-sort-algorithm/ß
}
*/


public class Quicksort {

	public static void main(String[] args) {
		int a[]= {23,50,31,54,93,73,32};
	    sort(a, 0, a.length-1);
	    System.out.println(Arrays.toString(a));
	}
	
	public static int partition(int a[],int low,int high) {
		
		int i=low-1, pivot=a[high];
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				i++;
				
				int temp=a[i]; // swap inside with out pivot
				a[i]=a[j];
				a[j]=temp;
			}//end of if	
	
		}//end of for
		int temp =a[i+1]; // put pivot at i+1 place. i is counter as to how many place they filled.
		a[i+1]=a[high];
		a[high]=temp;
		
		return i+1;
	}//end partition
	
	public static void sort(int a[], int low, int high) {
		if(low<high) {
			int p = partition(a, low, high);
			sort(a, low, p-1);
			sort(a, p+1, high);
		}//end of if
		
	}//end of sort
	

}
