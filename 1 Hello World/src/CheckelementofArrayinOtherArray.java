import java.util.Arrays;
import java.util.Scanner;

public class CheckelementofArrayinOtherArray {

	/* This program is not working as expected and not complete yet
	 * Problem is, if user string has one character missing from master array then it does not work
	 *Lets say user array is 'b,a,d' and master array is 'a,b,c,d' then since c is missing it will not detect. I think it cannot be solved this way
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]= {'a','t','c','d','b'};
		Arrays.sort(str);
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String user_string = s.nextLine();
		
		char char_st[] = user_string.toCharArray();
		
		Arrays.sort(char_st);
		String char_str = new String (char_st);
		String st = new String (str);
		
		//System.out.println(char_str);
		System.out.println("big array is "+char_str+" small array is "+st);
		
		if (char_str.contains(st)) {
			System.out.println("character in array "+char_st+" is contained in "+str);
			
		}//end of if
		
		else
			System.out.println("character in array "+char_st+" is not contained in "+str);
		
		
	s.close();	
	}// end of main
	
	
	

}// end of class
