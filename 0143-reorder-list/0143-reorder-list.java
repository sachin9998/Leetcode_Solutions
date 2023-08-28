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

        if (head == null || head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode temp2 = reverse(slow.next);
        slow.next = null;   

        ListNode temp3 = new ListNode(-100); 

        ListNode p1 = head;
        ListNode p2 = temp2;
        ListNode p3 = temp3;

        while(p1 != null || p2 != null) {

            if(p1 != null) {
                p3.next = p1;
                p3 = p3.next;
                p1 = p1.next;
            }

            if(p2 != null) {
                p3.next = p2;
                p3 = p3.next;
                p2 = p2.next;
            }
            
        }

        head = temp3.next;
    }
}