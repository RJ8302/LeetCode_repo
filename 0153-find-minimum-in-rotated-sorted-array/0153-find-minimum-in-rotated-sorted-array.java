class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        // If the array is not rotated
        if (nums[low] < nums[high]) {
            return nums[low];
        }

        int ans = Integer.MAX_VALUE; // Initialize ans to a large value

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Handle the case where middle element is equal to left and right elements
            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                ans = Math.min(ans, nums[mid]);
                low++;
                high--;
            }
            // If left half is sorted, the minimum element must be in the right half
            else if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // If right half is sorted, the minimum element must be in the left half
            else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;

    }
}