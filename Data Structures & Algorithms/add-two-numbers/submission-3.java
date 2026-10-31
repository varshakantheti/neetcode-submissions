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
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(l1!=null || l2!=null){
            if(l1==null){
                cur.next = new ListNode((l2.val + carry)%10);
                carry = (l2.val + carry)/10;
                l2=l2.next;
                cur = cur.next;
            } else if(l2==null){
                cur.next = new ListNode((l1.val + carry) % 10 );
                carry = (l1.val + carry)/10;
                cur = cur.next;
                l1=l1.next;
            } else {
                int temp = l1.val + l2.val + carry;
                cur.next = new ListNode(temp%10);
                carry = temp/10;
                cur = cur.next;
                l1 = l1.next;
                l2=l2.next;
            }
        }
        if(carry!=0){
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
