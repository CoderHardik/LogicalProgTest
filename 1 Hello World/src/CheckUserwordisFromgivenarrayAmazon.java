import java.util.Scanner;


public class CheckUserwordisFromgivenarrayAmazon {

	public static void main(String[] args) {
		
		char str[]= {'a','b','c','d','t'};

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String user_string = s.nextLine();
		
		char char_st[] = user_string.toCharArray();
		int count=0;
		
		
		for(int i=0; i<char_st.length; i++) {
		
			for (int j=0; j<str.length; j++) {
				if(char_st[i]==str[j]) {
					count++;
					break;
				}//end of if
			}// end of for j
			
		}//end for i
		
			
		if(count==char_st.length) {
			System.out.println("Your array is contained in master array");
		}//end of if
		else {
		System.out.println("Your array is not contained in master array");
		}//end of else
		
		s.close();
		}//end of main
	
		
	

}
