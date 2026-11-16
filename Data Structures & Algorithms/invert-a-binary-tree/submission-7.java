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
        if(root==null){
            return root;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            for(int i = 0; i<=q.size()-1; i++){
                TreeNode cur = q.poll();
                TreeNode temp = cur.left;
                cur.left = cur.right;
                cur.right = temp;
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
        }
        return root;
    }
}
