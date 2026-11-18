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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;

        int carry = 0;
        while(l1!=null || l2!=null){
            int temp = 0;
            if(l1!=null && l2!=null){
                temp = l1.val + l2.val;
            } else if (l1!=null){
                temp = l1.val;
            } else {
                temp = l2.val;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            temp = temp + carry;
            carry = temp / 10;
            temp = temp % 10;
            ListNode c = new ListNode(temp);
            cur.next = c;
            cur = cur.next;
        }
        if(carry!=0){
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
