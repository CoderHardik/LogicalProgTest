import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-loops/problem
 * We use the integers , , and  to create the following series:
 * 
 * Please check web page link to see real series as it can not be pasted
Series - s_n = a + (2^0 * b) + (2^1 * b) + (2^2 * b) + ... + (2^{n-1} * b)
Term 0: a + 1*b
Term 1: a + 1*b + 2*b
Term 2: a + 1*b + 2*b + 4*b
Term 3: a + 1*b + 2*b + 4*b + 8*b

To compute this efficiently, we can maintain a running sum. Instead of re-calculating the powers of 
 from scratch for every term, we start with and in each iteration  , we add to the current total. 

So
Term 0 = a+b
Term 1 = a+b+2b = (old term) +2b
Term 2 = a+b+2b+4b = (old term) + 4b 

every time new term is old term+2x(pre term)
old term +prev term
and prev term will 2 prev term next time

Sample Input
2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation */

public class HackerRankLoopSeries {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        
       
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp=b;
            int res = a+b;
            System.out.print(res+" ");
            for(int j=1; j<n; j++){
                
                temp = 2*temp; 
                res = res + temp; 
                System.out.print(res+" ");
            }
        System.out.println();
        }
        in.close();
        
    }
}
