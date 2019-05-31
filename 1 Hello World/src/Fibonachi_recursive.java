import java.util.Scanner;

public class Fibonachi_recursive {

	public static void main(String[] args) {
		
		// Fibonachi is 0,1,1,2,3,5,8... Basically sum of last 2 digit is next digit
		// In reccurssion method for fibonacci, it does lot of repeated work (O(n) so This is bad implementation)
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter postion you want to enter: ");
		int n = s.nextInt();
		
		int res = fib(n);
		 
		System.out.println(res);
		s.close();
	}//end of main

	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		
		else {
			
			return fib(n-1) + fib(n-2);
		}
		
	}
}
