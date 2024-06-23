class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // No jump needed if there's only one element

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            // Update the farthest point we can reach from the current position
            farthest = Math.max(farthest, i + nums[i]);

            // If we have reached the end of the current jump, make another jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                // If currentEnd has reached or surpassed the last index, break
                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}