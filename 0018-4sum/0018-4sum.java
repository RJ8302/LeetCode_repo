class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        
        if (n < 4) {
            return quadruplets;
        }

        Arrays.sort(nums);
        
        for (int i = 0; i < n - 3; i++) {
            // Avoid duplicate results for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            for (int j = i + 1; j < n - 2; j++) {
                // Avoid duplicate results for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Avoid duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        
                        // Avoid duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return quadruplets;
    }
}