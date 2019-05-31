import java.util.Scanner;

public class ReverseStringwithRecurssion {

	public static void main(String[] args) {
	

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String you want to reverese: ");
		String st = s.nextLine();
		String revstring = reverse(st);
		
		System.out.println("The reveresed String is: "+revstring);
		
		s.close();
	}//end of main
	
		public static String reverse(String str){
			if (str.isEmpty()) {
				return str;
			}//end of if
			
			else {
				return reverse(str.substring(1))+str.charAt(0);
			}//end of else	
			
		}//end of reverse
	

}//end of class
