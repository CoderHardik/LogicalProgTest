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


/*
Efforiciency of above program is O(n2) because in for loop there is arralist contain which will go through whole list every time.
Arraylist contains in expensive query..Instead use hashset contains.
Also anotehr limitation is that it will only return one missing number. Following prgraom will give list of missing number.


import java.util.*;

public class FindMissingNumber {

    public static void main(String[] args) {
        // Sample data for testing
        List<Integer> numbers = Arrays.asList(0, 1, 2, 4, 6);
        int n = 6; // Range from 0 to 6

        // Call the method and print the result
        List<Integer> missingNumbers = findMissing(numbers, n);
        System.out.println("Missing numbers from 0 to " + n + ": " + missingNumbers);
 
    }

    public static List<Integer> findMissing(List<Integer> A, int n){
        Set<Integer> seen= new HashSet<Integer>(A);
        List<Integer> missing = new ArrayList<>();

        for(int i=0; i<=n; i++){
            if(!seen.contains(i)){
                missing.add(i);
            }
        }
         
        return missing;
        
    }
    
}


*/
