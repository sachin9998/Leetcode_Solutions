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
    // Reverse a Linked List
    public ListNode reverse(ListNode head) {

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

    public int pairSum(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        // Finding Left most middle node
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = reverse(slow.next);
        slow.next = temp;

        int maxTwin = 0;

        ListNode p1 = head;
        ListNode p2 = slow.next;

        while(p2 != null) {
            if(p1.val + p2.val > maxTwin) {
                maxTwin = p1.val + p2.val;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return maxTwin;
    }
}