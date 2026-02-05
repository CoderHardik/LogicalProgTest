import java.util.Scanner;

/*
Assume that you have an array given to you, arr1=[‘a’, ‘b’, ‘c’, ‘d’, ‘t’].. 
Now you let user enter a string and validate that string they enter is made from characters we have in array. 
Show it is valid if it consist all words and say it is not if it is not..

I got 2 user string to test..
St1 = cat;   \\ valid string
st2= add;  \\invalid string since ‘d’ is repeated

/*

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
