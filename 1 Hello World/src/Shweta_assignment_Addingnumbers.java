
/* Take input x
 * and print output x+xx+xxx+xxxx
 * 
 * i.e.
 * if 5 -> 5+55+555+5555
 * 
 */
public class Shweta_assignment_Addingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		double rec=5;
		double sum=0;
		
		
		for (int i=1;i<4; i++) {
			rec= (rec*10)+x;
			sum= rec+sum;			
		}
		
		System.out.println(sum+x);
	}//end of main

} //end of class
