

/* 
115 -> 111.  (Rev - 511)
117 - 121
Logic

1. Put last dig = first dig  (3 dig ).  —> 4 dig last dig = rev of first 2 -> 5 dig last 2 dig = rev of first 2
And check diff between num

2. Increase middle num and then check num

 * Given an integer, find the nearest palindrome to that number.
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/
 */
public class ClosestPalindromeAmazon {

	public static void main(String[] args) {
    	
    	int a=117;
    	
    	 closestPali(a);
    	 
    	 /*
    	  * Psuedo:
		  Goal I mainly think is to copy fist half section of number to last as usually that is the closest - https://afteracademy.com/article/find-the-closest-palindrome
		  i.e. - 127 -> 121 ; 721 -> 727
		  Logic then would be, to get first digit (up to middle) and copy first digit i.e. -> 127 -> 12 (first digit up to middle)+ first digit
    	  * Find length / length of 117 is 3 - while(x>0) x=x/10
    	  * Find power as to find how many last digit needed -> For 3 digit number need 1 last digit, for 4 and 5 digit we need 2 last digits to make it equal
    	  * reverse number -> Reverse of 117 is 711- this function is standard reverse the number logic
    	  * Now check palindrome candidate to do so - last digit of rev number 
		  -- Logic - 
    	  * last digit = rev % power -- Basically rev number is 711 so 711%10 = 1 -> This so we basically 
    	  * fist digit = num / power
    	  * so candidate is  = first_digit * power = last digit =  (num / power *10)  +  (rev % power)
    	  * candidate2 candidate + pow
    	  * check difference between candidate1 and num then candidate2 and num
    	  * (For difference use Math.abs to get absolute value. Means it will not consider +ve or -ve)
    	  */
    	
    	
    }//end of main
    
   
	 public static void closestPali(int a){

	    	int length=0;
	    	int x = a;
	    	int y= a;

	    	while(x>0){
	    		x=x/10;
	    		length++;   // length =3
	    	}

	    	int rev_dig = length/2; //This is how Many digit we have to take from first and last  3-1, 4,5-2, 6,7-3 

	    	int pow=1;

	    	while(rev_dig>0){
	    		pow=pow*10;
	    		rev_dig--; //pow=10
	    	}


	    	int rev = rev(a);//711
	    	int palindrome_dig = rev%pow ;  //palindrome_dig = 1
	    	int first_dig = a/pow;  // first_dig = 11
	    	int candidate = (first_dig*pow) + palindrome_dig; //111

	    	if(a%2==0){
	    		System.out.println(candidate+" is your number");
	    	}

	    	else
	    	{
	    	   int diff1 = (candidate - a) ; // apply difference function

	    		int candidate2 = candidate+pow;
	    		int diff2 = candidate2 - a;  //apply diff function

	    		if (Math.abs(diff2)<Math.abs(diff1)){
	    		System.out.println(candidate2+ " is the number");
	    		}
	    		else {
	    		System.out.println(candidate+ " is the number");
	    		}

	    	}

	    }//end of method


	    	public static int rev(int num){
	    	int rev = 0;

	    	while(num>0){
	    	rev = rev*10 + num%10;
	    	num=num/10;
	    	}

	    	return rev;
	    	}

	
}
