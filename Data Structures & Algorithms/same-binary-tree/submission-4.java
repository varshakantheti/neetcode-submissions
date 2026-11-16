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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null){
            return true;
        }
        if((q==null && p!=null) || (q!=null && p==null)){
            return false;
        }
        Queue<TreeNode> pq = new ArrayDeque<>();
        Queue<TreeNode> qq = new ArrayDeque<>();
        pq.offer(p);
        qq.offer(q);
        while(!pq.isEmpty() && !qq.isEmpty()){
            TreeNode tempp = pq.poll();
            TreeNode tempq = qq.poll();
            if(tempp.val != tempq.val){
                return false;
            }
            if((tempp.left!=null && tempq.left==null) || (tempq.left!=null && tempp.left==null) || (tempp.right!=null && tempq.right==null) || (tempq.right!=null && tempp.right==null)){
                return false;
            }
            if(tempp.left!=null){
                pq.offer(tempp.left);
                qq.offer(tempq.left);
            }
            if(tempp.right!=null){
                pq.offer(tempp.right);
                qq.offer(tempq.right);
            }
        }
        return true;
        
    }
}
