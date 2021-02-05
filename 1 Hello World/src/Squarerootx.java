
public class Squarerootx {

	public static void main(String[] args) {
		int num =80;
		
		for(int i=0; i<=(num/2); i++) {
			if(i*i==num) {
				System.out.println("Square root of given number is: "+i);
				break;
			}//end of if
			
			else if(i*i>num) {
				System.out.println("Square root of given number is: " +(i-1));
				break;
			}//end of if
		}//end of for
	}
}
