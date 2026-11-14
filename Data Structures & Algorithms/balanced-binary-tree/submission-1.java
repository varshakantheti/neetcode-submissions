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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0]==1;
    }
    //1 is true
    //0 is false
    //true/false , height
    public int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{1,0};
        }
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int balanced = 0;
        if(r[0]==1 && l[0]==1 && Math.abs(l[1] - r[1])<=1){
            balanced = 1;
        }
        return new int[]{balanced, 1+ Math.max(l[1], r[1])};
        
    }
}
