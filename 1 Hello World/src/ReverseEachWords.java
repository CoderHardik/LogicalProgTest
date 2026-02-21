import java.util.Scanner;

public class ReverseEachWords {
		public static void main(String[] args){
    String s= "This is test";
    System.out.println(reverseword(s));
  }

  public static String reverseword(String s){
    String st[] = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String sc: st){
      for (int i =sc.length()-1; i>=0; i--){
        sb.append(sc.charAt(i));
      }
      sb.append(" ");
    }//end of for
  return sb.toString();
}//end of method
	
// Earlier program was done by recurssion which is inefficient method. Even though here it is for within for it should be O(mxn) .. 
	//not repeating for same String twice. Plus we are using string builder so more effiecient than String.
	
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
