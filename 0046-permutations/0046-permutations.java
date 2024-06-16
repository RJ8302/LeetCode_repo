class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        
        backtrack(nums, currentPermutation, used, result);
        
        return result;
    }
    
    private void backtrack(int[] nums, List<Integer> currentPermutation, boolean[] used, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation)); // Make a copy of current permutation
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                // Add nums[i] to current permutation
                currentPermutation.add(nums[i]);
                used[i] = true;
                
                // Recursively generate permutations
                backtrack(nums, currentPermutation, used, result);
                
                // Backtrack: remove nums[i] and mark it as unused
                currentPermutation.remove(currentPermutation.size() - 1);
                used[i] = false;
            }
        }
    }
}