/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int max(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for(int i=start; i<=end; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }

    public TreeNode construct(int[] arr, int start, int end){
        if(start > end) return null;
        if(start == end) return new TreeNode(arr[start]);

        int idx = max(arr, start, end);
        TreeNode root = new TreeNode(arr[idx]);
        root.left = construct(arr, start, idx-1);
        root.right = construct(arr, idx+1, end);

        return root;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = construct(nums, 0, nums.length-1);
        return root; 
    }
}