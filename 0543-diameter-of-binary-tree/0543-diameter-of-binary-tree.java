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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxx = new int[1];
        dia(root, maxx);
        return maxx[0];
    }
    public int dia(TreeNode root, int[] maxx){
        if(root == null){
            return 0;        
        }

        int lh = dia(root.left, maxx);
        int rh = dia(root.right, maxx);

        maxx[0] = Math.max((lh + rh), maxx[0]);
        return Math.max(lh, rh) + 1;
    }
}