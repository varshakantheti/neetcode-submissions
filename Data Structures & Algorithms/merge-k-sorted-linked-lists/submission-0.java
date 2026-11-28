/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       ListNode dummy = new ListNode(-1);
       ListNode head = dummy;
       PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val-b.val);
       for(int i=0; i<lists.length;i++){
        if(lists[i]!=null){
            q.offer(lists[i]);
        }
       }
       while(!q.isEmpty()){
        ListNode temp = q.poll();
        head.next = new ListNode(temp.val);
        if(temp.next!=null){
            q.offer(temp.next);
        }
        head = head.next;
       }
       return dummy.next;
    } 
}
