class Solution {
    public int addDigits(int num) {
         if (num == 0) {
            return 0;
        }
        
        // Compute the digital root iteratively
        while (num >= 10) {
            num = computeSumOfDigits(num);
        }
        
        return num;
    }
    
      private static int computeSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit from num
        }
        return sum;
    }
}