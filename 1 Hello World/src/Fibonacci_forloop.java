import java.util.Scanner;

public class Fibonacci_forloop {

	public static void main(String[] args) {
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
			
		}//end of else
		
int n1=0, n2=1;
		for(int i=2; i<n; i++) {
				int n3=n1+n2;
				n1=n2;
				n2=n3;
				
		}//end for
		return n2;

	}//end of fib

}
