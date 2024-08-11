class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Increment count if the last bit is 1
            n >>>= 1;         // Right shift the bits of n (unsigned)
        }
        return count;
    }
}