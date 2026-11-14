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
        if(root==null){
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int num = q.size();
        while(!q.isEmpty()){
            num = q.size();
            List<Integer> level = new ArrayList<>();
            while(num>0){
                TreeNode cur = q.poll();
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
                level.add(cur.val);
                num--;
            }
            ret.add(level);
        }
        return ret;

    }
}
