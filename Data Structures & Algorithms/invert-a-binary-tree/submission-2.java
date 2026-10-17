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
    public TreeNode invertTree(TreeNode root) {
        TreeNode one = new TreeNode(2);
        if(root==null || (root.left==null && root.right==null)){
            return root;
        }
        Stack<TreeNode> myStack = new Stack<>();
        myStack.push(root);
        while(!myStack.empty()){
            TreeNode top = myStack.pop();
            TreeNode temp = top.right;
            top.right = top.left;
            top.left = temp;
            if(top.right!=null && (top.right.right!=null || top.right.left!=null)){
                myStack.push(top.right);
            }
            if(top.left!=null && (top.left.right!=null || top.left.left!=null)){
                myStack.push(top.left);
            }
        }
        return root;
    }
}
