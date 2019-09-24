/*Check if user input string is contained in master array.

e.g.
char master_array[]= {'a','t','c','d','b'};

user input  String st='tad';

output = "Your array is contained in master array and count is "

*/
import java.util.HashMap;
import java.util.Scanner;


public class CheckelementsofArrayinOtherArraywithhashmapAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]= {'a','t','c','d','b'};
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String: ");
		String user_string = s.nextLine();
		char char_st[] = user_string.toCharArray();
		
		
		HashMap <Integer, Character> hm= new HashMap<>();
		
		for (int i=0 ; i<str.length; i++) {
			hm.put(i, str[i]);
		}//end of for
		
		//int start=0;
		int count=0;
		int start=0;
		while (start<char_st.length) {
			if(hm.containsValue(char_st[start])) {
				count++;
				//for repeated character user hm.put(count+1, char_st[start]) and do logic that way. duplicate string logic
			}//end of if
			start++;
		}
		
		if(count==char_st.length) { // <-- This is main logic. Same can be done using simple array loop
			System.out.println("Your array is contained in master array and count is "+count);
		}//end of if
		else {
			System.out.println("Your array is not contained in master array");
		}//end of else
		
		s.close();

	}//end of main
	

}//end of class
