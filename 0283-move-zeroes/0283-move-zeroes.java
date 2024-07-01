class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        
        while (left < nums.length) {
            if (nums[left] != 0) {
                nums[right] = nums[left];
                right++;
            }
            left++;
        }
        
        // Fill the rest of the array with zeros
        while (right < nums.length) {
            nums[right] = 0;
            right++;
        }
    }
}