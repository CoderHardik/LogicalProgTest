import java.util.Scanner;

public class ReverseEachWords {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String you want to reverese: ");
		String st = s.nextLine();
		String finalstring ="";
		String [] starr = st.split(" ");
		
		for(int i=0; i<=starr.length-1; i++) {
			finalstring= finalstring+' '+reverseword(starr[i]);
		}
		
		System.out.println("Reverse of each word is: "+finalstring);

		s.close();
		
	}//end of main
	
	public static String reverseword(String st) {
		if (st.isEmpty())
		return st;
		return reverseword(st.substring(1))+st.charAt(0);
	}//end of revst
	
	
	/*
	 * 

The function takes the first character of a String - str.charAt(0) - puts it at the end and then calls itself - reverse() - on the remainder - str.substring(1), adding these two things together to get its result - reverse(str.substring(1)) + str.charAt(0)

When the passed in String is one character or less and so there will be no remainder left - when str.length()  <= 1) - it stops calling itself recursively and just returns the String passed in.

So it runs as follows:

reverse("Hello")
(reverse("ello")) + "H"
((reverse("llo")) + "e") + "H"
(((reverse("lo")) + "l") + "e") + "H"
((((reverse("o")) + "l") + "l") + "e") + "H"
(((("o") + "l") + "l") + "e") + "H"
"olleH"


	 * 
	 */
	
	

}
