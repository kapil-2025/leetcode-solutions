class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10; // Step 1: Get last digit
            x = x / 10;         // Step 2: Remove last digit

            // Step 3: Check overflow
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) {
                return 0;
            }

            // Step 4: Build the reversed number
            rev = rev * 10 + digit;
        }
        
        return rev;
    }
}
