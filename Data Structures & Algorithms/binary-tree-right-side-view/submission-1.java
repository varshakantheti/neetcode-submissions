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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int t;
        while(!q.isEmpty()){
            t=q.size()-1;
            TreeNode temp = q.poll();
            ret.add(temp.val);
            if(temp.right!=null){
                q.offer(temp.right);
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            while(t>0){
                temp = q.poll();
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                t--;
            }
        }
        return ret;
    }
}
