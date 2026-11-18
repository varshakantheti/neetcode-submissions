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
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        boolean first = true;
        ListNode cur = new ListNode(0);
        int carry=0;
        while(l1!=null){
            stack1.push(l1);
            l1 = l1.next;
        }
        while(l2!=null){
            stack2.push(l2);
            l2 = l2.next;
        }
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int sum = carry;
            if(!stack1.isEmpty()){
                sum+= stack1.pop().val;
            }
            if(!stack2.isEmpty()){
                sum+= stack2.pop().val;
            }
            if(first){
                cur.val = sum%10;
                first = false;
            } else {
                ListNode temp = new ListNode(sum%10);
                temp.next = cur;
                cur = temp;
            }
            carry = sum/10;
        }
        if(carry!=0){
            ListNode temp = new ListNode(carry);
            temp.next = cur;
            cur = temp;
        }
        return cur;
    }
}