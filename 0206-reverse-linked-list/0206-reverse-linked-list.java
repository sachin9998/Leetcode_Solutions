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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null) {

            next = curr.next; // Store next node in next
            curr.next = prev; // Set curr.next as prev 
            prev = curr; // Set prev as curr
            curr = next; // Increment curr to next
           
        }


        return prev;
    }
}