/* Given an integer, find sum of digits of that number until sum becomes single digit
 * a=199 --> 1+9+9 -->19 --> 10 --> 1
 * a=256 --> 2+5+6 --> 13 ->> 1+3 --> 4
 * https://www.geeksforgeeks.org/amazon-interview-experience-set-420-qae/

result = 1 + (num - 1) % 9;

Main theoram:
In decimal system (0-9) number leaves number and the sum of its digits always leave the same remainder when divided by 9. 
Summing the digits repeatedly doesn't change this remainder, 
so you eventually land on the single-digit value that represents that remainder

Note on the formula: The formula 1 + (n - 1) % 9 is a clever way to handle the "9" case. 
A standard n % 9 would return 0 for multiples of 9 (like 18 or 27), but the digital root of those numbers is 9. 
Subtracting 1 before the modulo and adding it back afterward shifts the range from 0–8 to 1–9
 
 */


	
	public class DigitalRootMod9 {
    public static void main(String[] args) {
        int num = 199;
        int result;

        if (num == 0) {
            result = 0;
        } else {
            // The formula 1 + (num - 1) % 9 handles the case 
            // where num is a multiple of 9 (like 18 or 27).
            result = 1 + (num - 1) % 9;
        }

        System.out.println("Final Single Digit (Mod 9): " + result);
    }
}


}
