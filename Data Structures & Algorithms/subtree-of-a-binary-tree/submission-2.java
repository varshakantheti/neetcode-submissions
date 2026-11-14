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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null){
            return true;
        } else if (root!=null && root.val == subRoot.val && sameTree(root, subRoot)){
            return true;
        } else if(root==null){
            return false;
        }
        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
        
    }
    public boolean sameTree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null && root==null){
            return true;
        } else if(subRoot==null || root==null || root.val != subRoot.val){
            return false;
        }
        return sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
    }
}
