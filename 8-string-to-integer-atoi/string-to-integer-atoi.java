class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;            // Declare outside loop
        long result = 0;         // Declare outside loop

        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign * result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }
}
