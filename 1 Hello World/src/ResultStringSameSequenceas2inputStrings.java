
public class ResultStringSameSequenceas2inputStrings {

	public static void main(String[] args) {
		// Here check if result string has character in same sequence as 2 input string. A and B could  be different length
		// ex. A = 'abc' B = 'def' and C = 'abcdef' then good. C = 'defabc' is good
		//C ='adbecf' is also good and C will not have any repeated chars
		
		String A = "abc";
		String B = "def";
		String C = "abcdef";
		
		
		/*Logic: Check lenth of C is equal to A+B
		 * Then check if first letter from C is either from A or B, if so -increment i/j and k
		 * Once above loop is done, check i+j ==k. If so you know loop completed successfully so print result
		*/
		if(A.length()+B.length()==C.length()) {
			int i=0, j=0, k=0;
			
			while(i<A.length() && j<B.length()) {
				if(A.charAt(i)==C.charAt(k)) {
					i++; k++;
				}//end of if2
				
				else if(B.charAt(j)==C.charAt(k)) {
					j++; k++;
				}//end of else if
				
			}//end of while
			
			
			while(i<A.length()) {
				if(A.charAt(i)==C.charAt(k)) {
					i++; k++;
				}//end of if
				
			}// end of while 2
			
			while(j<B.length()) {
				if(B.charAt(j)==C.charAt(k)) {
					j++; k++;
				}//end of else if
			}//end of while 3
			
			if(i+j==C.length()) {
				System.out.println("Result string is in sequence ");
			}
			
			else {
				System.out.println("Result string does not qualify ");
			}
			
		}//end of if
		
		else {
			System.out.println(" Result string does not qualify");
		}
		
		

	}//end of main

}// end of class
