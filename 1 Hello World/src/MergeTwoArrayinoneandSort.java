import java.util.Arrays;

public class MergeTwoArrayinoneandSort {

	//The number of elements initialized in nums1 and nums2 are m and n respectively.
	//m and n are just initialized elements and not length of array
	
	public static void main(String[] args) {
		int A[]= {1,2,4,5,0,0,0};
		int B[]= {2,3,6};
		
		int m = 4;
		int n = 3;
		
		while(m>0 && n>0){
			
			if(A[m-1]>B[n-1]) {
				A[m+n-1]=A[m-1];
				m--;
			}//end of if
			
			else {
				A[m+n-1]=B[n-1];
				n--;
			}//end of else
		}//end of while
		
		while(n>0) {
			A[m+n-1]=B[n-1];
			n--;
		}//end of while 2

		System.out.println(Arrays.toString(A));
		
	}//end of main

}



