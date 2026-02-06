import java.util.Scanner;

public class ReverseStringByChararray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String you want to reverese: ");
		
		String st = s.nextLine();
		String res ="";
		char [] charr = st.toCharArray();
		
		for(int i=st.length()-1; i>=0; i-- ) {
			res=res+(charr[i]);
			
		}//end of for

		System.out.println(res);
		
		s.close();
	}// end of main

}

/*
Here in above program, we should avoid using string in loop-
Here both above method's complexity is O(n²) because there is one for loop and in each loop we are creating new string
    so it each time new string cause n and for loop n which is n2

    String builder is clean way because it it had append method and does not create new string each time
Instead use below-

 StringBuilder sb = new StringBuilder();
    for (int i =input.length()-1; i<=0; i--){
        sb.append(input.charAt(i));
    }
    return sb.toString();
*/
