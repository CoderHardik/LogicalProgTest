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
