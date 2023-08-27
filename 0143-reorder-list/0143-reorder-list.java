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

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public void reorderList(ListNode head) {

        // Base Case
        if(head == null || head.next == null) {
            return;
        }

        // Finding Middle Node
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        } 

        // Reversing part after middle
        ListNode newNode = reverse(slow.next);
        slow.next = null;
        
        ListNode temp1 = head;
        ListNode temp2 = newNode;

        ListNode dummy = new ListNode(-100);
        ListNode p3 = dummy;

        while(temp1 != null || temp2 != null) {
            if(temp1 != null) {
                p3.next = temp1;
                p3 = p3.next;
                temp1 = temp1.next;
            }

            if(temp2 != null) {
                p3.next = temp2;
                p3 = p3.next;
                temp2 = temp2.next;
            }


        }

        head = dummy.next;
         // https://leetcode.com/problems/reorder-list/solutions/3148599/easily-expalined-step-by-step-code-100-beats-and-0ms-runtime/
    }
}