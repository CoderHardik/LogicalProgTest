/*Check if user input string is contained in master array.

e.g.
char master_array[]= {'a','t','c','d','b'};

user input  String st='tad';

output = "Your array is contained in master array and count is "

Assumptions:
- Here String contains characters
- User input string contains less number of character than master array
- Assuming that master array contains unique values (Following code should work regardless)

Test your code:
- Input string is not null
- Input string is made of character or numbers?
- Special characters
- Check condition
- Repeated character - user string -‘aaaa’



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
		}
		
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
	

	/*Easier way to do this program:
	 * 
	 * Int Convert array to array list(char a[], String st){

ArrayList<Character> al = new ArrayList<>();
Count =0;
For (char x: a){
Al.add(x)
}

Char b[] = st.toCharArray();

For (char y: b){
If (al.contains(y))
count++;
}

if(count==b.length){
sysout(“Your string belongs to master array”)
}
Else
sysout(“Your string does not belongs to master array”)
}

	 * 
	 */
	
	
	
}//end of class
