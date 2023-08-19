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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-100000);
        ListNode itr = dummy;
        //itr = head;
        ListNode curr = head;

        while(curr != null) {

            if(curr.val != itr.val) {
                itr.next = curr;
                itr = itr.next;
            }
            curr = curr.next;
        }

        itr.next = curr;

        return dummy.next;
    }
}