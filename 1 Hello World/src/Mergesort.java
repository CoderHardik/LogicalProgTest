import java.util.Arrays;

public class Mergesort{
	
	public static void main(String [] args) {
		int []ar = {7,4,9,1,5,3};
       //Reference - https://www.interviewbit.com/tutorial/merge-sort-algorithm/
        
        mergeSort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));
		
		//mergeSort(a[])
		
	}//end of main
	
	public static void merge(int a[], int start, int mid, int end) {
		
		int temp[]= new int[end-start+1];
		int i=start, j=mid+1, k=0;// create crawlers for array
		//Goal here is to create temp array - start creating array with whatever is smaller
		// merge function take two intervals
		// one from start to mid
		// second from mid+1, to end
		// and merge them in sorted order
		
		while(i<=mid && j<=end) { 
			
			if(a[i]<=a[j]) {
				temp[k]=a[i];
				i++; k++;
			}//end of if
			
			else
			{
				temp[k]=a[j];
				j++;k++;
			}//end of else
		}//end of while
		
		
		// Another set of while loops as  above while is bound to end with one of array incomplete. So anything left will be completed below
		// Basically above both condition have to met, i<=mid && j<=end, but in many cases, one of them might not come true so it will come to this loop
		while(i<=mid) {
			temp[k]=a[i];
			i++; k++;
		}//end of while
		
		while (j<=end) {
			temp[k]=a[j];
			k++;j++;
		}//end of while
		
		
		for(i=start; i<=end; i++) {
			a[i]=temp[i-start];// copy final array
		}//end of for
		
	}//end of merge
	
	public static void mergeSort(int a[], int start, int end){
		
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(a, start, mid); //Left array- It will keep calling this until it breaks down left most array into smallest array
			mergeSort(a, mid+1, end);// Right array - recursive call so it will keep dividing arrays
			merge(a,start,mid,end);// here sorted array will be merged - 
			
			/*remember that if let's say array is of 8 elements, it will start deviding 4 then 2 so left most 2 array will go for execution first
			 * Left most single element will be from first line here
			 * And second element will be second line and so it will reach third line of calling merege function for first 2 element 
			 * and it will keep repeating same for other
			 */
			
		}//end of if
		
	}//end of merge sort
	
	
}//end of class