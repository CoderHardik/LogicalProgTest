import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* There is a list {1,3,2,,4,6} as input.
 * Op =5
 * In above, list is not sorted and should not be sorted in process
 * Here assume that list will start from 1 and go to n
 * Just check which number is missing from 1 to n without sorting list
 */



public class FindMissingNumber {

	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);
		al.add(6);
		int x = findmissing(al);
		System.out.println(x);
	}
	
	static int findmissing(List<Integer> A) {
		int counter=1;
		int result=0;
		
		for(int a:A) {
			if(!A.contains(counter)) {
				result=counter;
				break;
			}
			counter++;
		}//end of for
		
		return result;
	}//end of method

}//end of class
