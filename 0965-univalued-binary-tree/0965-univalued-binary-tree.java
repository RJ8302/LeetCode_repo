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
    public boolean isUnivalTree(TreeNode root) {
        // If the tree is empty, it's technically uni-valued (return true)
        if (root == null) {
            return true;
        }
        
        // Call the helper function to perform DFS
        return dfs(root, root.val);
    }
    
     private boolean dfs(TreeNode node, int value) {
        // If we reach a null node, it means we haven't encountered a different value
        if (node == null) {
            return true;
        }
        
        // If the current node's value is different from the root's value, return false
        if (node.val != value) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        return dfs(node.left, value) && dfs(node.right, value);
    }
}