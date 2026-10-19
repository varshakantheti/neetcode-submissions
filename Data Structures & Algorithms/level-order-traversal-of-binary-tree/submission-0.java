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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return ret;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            for(int i = q.size(); i>0; i--){
                TreeNode temp = q.poll();
                if (temp!=null){
                    level.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
            if(!level.isEmpty()){
                ret.add(level);
            }
        }
        return ret;
    }
}
