class Solution {
    public int myAtoi(String str) {
        // Trim leading whitespace
        str = str.trim();
        if (str.isEmpty()) return 0;

        // Determine the sign
        int sign = 1;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            str = str.substring(1);
        }

        long result = 0; // Use long to handle overflow
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) break;
            result = result * 10 + (c - '0');
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) (result * sign);
    }
}