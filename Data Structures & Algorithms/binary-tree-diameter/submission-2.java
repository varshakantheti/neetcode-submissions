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
    int ret = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ret;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        ret = Math.max(ret,dfs(root.left) + dfs(root.right));
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}
