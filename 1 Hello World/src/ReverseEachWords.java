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

ANOTHER NOTE: 

Here in above program, we should avoid using string in loop-
Here both above method's complexity is O(n²) because there is one for loop and in each loop we are creating new string
    so it each time new string cause n and for loop n which is n2

    String builder is clean way because it it had append method and does not create new string each time
Instead use below-

 StringBuilder sb = new StringBuilder();
    for (int i =st.length()-1; i<=0; i--){
        sb.append(st.charAt(i));
    }
    return sb.toString();


	 * 
	 */
	
	

}
