class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 are not palindromes unless the number is 0
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the integer
        while (x > 0) {
            int pop = x % 10;
            x /= 10;
            reversed = reversed * 10 + pop;
        }

        // Check if the original number is equal to the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 121;

        if (solution.isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
