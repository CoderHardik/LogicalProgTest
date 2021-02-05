
public class ReverseStringwithStringCharAt {

	public static void main(String[] args) {
		rev("Hello");

	}

	
	public static void rev(String s) {
		
		String rev ="";
		for (int i= s.length()-1 ; i>=0; i--) {
			rev = rev+""+s.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
}
