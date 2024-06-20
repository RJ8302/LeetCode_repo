class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || seen.contains(nums[i])) continue;
            used[i] = true;
            tempList.add(nums[i]);
            seen.add(nums[i]);
            backtrack(nums, tempList, used, result);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}