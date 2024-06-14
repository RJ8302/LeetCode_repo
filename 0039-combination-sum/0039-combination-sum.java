class Solution {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort candidates to avoid duplicate combinations
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break; // Optimization: candidates are sorted, so no need to continue
            }
            current.add(candidates[i]);
            backtrack(result, current, candidates, target - candidates[i], i); // Use the same candidate again
            current.remove(current.size() - 1); // Backtrack
        }
    }
}