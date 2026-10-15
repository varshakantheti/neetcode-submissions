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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start2 = slow.next;
        slow.next = null;
        ListNode after = start2.next;
        start2.next = null;
        while(after != null){
            ListNode temp = after.next;
            after.next = start2; 
            start2 = after;
            after = temp;
        }
        while(start2 != null){
                ListNode temp = head.next;
                ListNode temp2 = start2.next;
                head.next = start2;
                head = head.next;
                head.next = temp;
                head = temp;
                start2 = temp2;
        }

    }
}
