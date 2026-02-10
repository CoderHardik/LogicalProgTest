
public class ReverseInteger {
	/**
     * Reverses a 32-bit signed integer.
     * Returns 0 if the reversed value overflows the 32-bit signed integer range.
     */
    public int reverse(int x) {
        long reversedNum = 0;
        
        while (x != 0) {
            // Extract the last digit (works for both positive and negative)
            int lastDigit = x % 10;
    
            // Build the reversed number
            reversedNum = (reversedNum * 10) + lastDigit;
            
            // Move to the next digit
            x /= 10;
            
            // Check for 32-bit overflow/underflow
            if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return (int) reversedNum;
    }

    // Main method for a quick manual check
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Reverse 123: " + sol.reverse(123));   // Expected: 321
        System.out.println("Reverse -123: " + sol.reverse(-123)); // Expected: -321
        System.out.println("Reverse 120: " + sol.reverse(120));   // Expected: 21
    }

}
