/*
How the Logic Works 
Using your provided array int a[] = {1, 4, 8, 15, 17};, here is a step-by-step breakdown of what the maxadjdiff method does: 

Step	Index i	Index j	Calculation (a[j] - a[i])	Current max
1	0 (1)	1 (4)	4 - 1 = 3	3
2	1 (4)	2 (8)	8 - 4 = 4	4
3	2 (8)	3 (15)	15 - 8 = 7	7
4	3 (15)	4 (17)	17 - 15 = 2	7


*/


public class MaxDiffAdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,4,8,15,17};
		int m = maxadjdiff(a);
		System.out.println(m);
	}
	
	public static int maxadjdiff(int a[]) {
		
		int i=0;
		int j =i+1;
		int max=0;
		
		while(j<a.length) {
			if(max<=a[j]-a[i]) {  //max=3, i=1, j=2 --
			max = a[j]-a[i]; //max=4
			}	
			i++;
			j++;
		}
		
		return max;
	}

}
