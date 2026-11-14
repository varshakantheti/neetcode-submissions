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
    int count = 0;
    public int goodNodes(TreeNode root) {
       if(root==null){
        return count;
       }
       int maxx = root.val;
       count++;
       dfs(root.left, maxx);
       dfs(root.right, maxx);
       return count;
    }
    //max, treeNode
    public void dfs(TreeNode root, int maxx){
        if(root!=null){
            if(root.val>=maxx){
                count++;
                dfs(root.left, root.val);
                dfs(root.right, root.val);
            } else {
                dfs(root.left, maxx);
                dfs(root.right, maxx);
            }
        }
    }
}
