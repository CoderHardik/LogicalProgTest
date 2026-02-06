import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-loops/problem
 * We use the integers , , and  to create the following series:
 * 
 * Please check web page link to see real series as it can not be pasted

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , 
and  values as a single line of  space-separated integers.
Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , 
and  values for that query.
Constraints

Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single 
line of  space-separated integers.

Explain:
series format is a+(2^j)b -> res = res + temp
Initialization: It sets int res = a + b; as the first term (since \(2^{0}=1\), the first term is \(a+1\cdot b\)).

Iteration: The inner loop starts from j = 1 and continues until n-1.Updating the Term: In each step, it updates a temp variable by multiplying it by 2 (temp = 2 * temp), 
effectively calculating the next power of 2 (\(2^{j}\cdot b\)).

Cumulative Sum: It adds this new temp to the previous result (res = res + temp) to get the next term in the series.

Sample Input
2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :
... and so on.
Once we hit , we print the first ten terms as a single line of space-separated integers.
We use , , and  to produce some series :
We then print each element of our series as a single line of space-separated values.
 */

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
