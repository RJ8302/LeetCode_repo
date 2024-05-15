class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int n = x % 10;
            x = x/10;
            
            
            //checking if the reverse id not exceeeding the max and values
            if (reversed > Integer.MAX_VALUE/10 || reversed ==Integer.MAX_VALUE/10&& n>7) {
                return 0; // Overflow condition
            }
            if (reversed < Integer.MIN_VALUE/10 || reversed ==Integer.MIN_VALUE/10&&n<-8) {
                return 0; // Underflow condition
            }    
            
            reversed = reversed * 10 + n;
        }
        return reversed;
    }
}