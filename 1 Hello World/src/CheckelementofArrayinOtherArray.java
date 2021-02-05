import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckelementofArrayinOtherArray {

	/* One thing to remember here is that if you directly convert 
	 * array to arraylist this will just create one string of all different 
	 * characters and dump it in array list. We should rather add one element one bt
	 * one and that got it working
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		char[] master= {'a','b','c','d','e'};
		
		char user[]= {'b','c','f'};
		
		ArrayList<Character> m = new ArrayList<Character>();
		
		for(char c: master) {
			m.add(c);
		}
		
		System.out.println(m);
		
		for(char c: user) {
			if(m.contains(c)) {
				count++;
			}
		}//end of for
		
		if (count==user.length) {
				System.out.println("User Arrays is in Master Array " +count);
			}//end of if
			
			else {
				
				System.out.println("User Arrays is not in Master Array " +count);
			}//end of else
			
	}// end of main
	

	/*   ------Code to check if element of one array is in other array. Array is integer-----
	 * 
	 * Int Convert array to array list(int a[], int b[]){

ArrayList<Integer> al = new ArrayList<>();
Count =0;
For (int x: a){
Al.add(x)
}

For (int y: b){
If (al.contains(y))
count++;
}

Return count;

}
	 * 
	 * 
	 */
	

}// end of class
