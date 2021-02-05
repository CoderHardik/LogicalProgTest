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
		}
		
int a=0, b=1;
		for(int i=2; i<n; i++) {
				int sum=a+b;
				a=b;
				b=sum;
		}
		return b;

	}//end of fib
}
