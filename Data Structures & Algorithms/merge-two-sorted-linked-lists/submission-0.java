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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(0);
        ListNode tempp = newHead;
        while(list1!=null && list2!=null){
            if(list2==null || list1.val <= list2.val){
                tempp.next = list1;
                tempp = tempp.next;
                list1 = list1.next;
            } else {
                tempp.next = list2;
                tempp = tempp.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            tempp.next = list2;
        } else if(list2 == null){
            tempp.next = list1;
        }
        return newHead.next;
    }
}