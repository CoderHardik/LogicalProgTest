
public class StartPaterrn {

	public static void main(String[] args) {
		

		for (int i=0 ; i<8; i++) {
			
			if(i< 4) {
			for (int j=0; j<=i; j++) {
				
			System.out.print("* ");
			
			}//end of j
			}
			else 
		for (int k=8-i; k>=0; k--) {
			System.out.print("* ");
		}
			System.out.println("");
		}//end of i
		
	}//end of main

}// end of class
