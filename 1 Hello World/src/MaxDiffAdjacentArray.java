
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
