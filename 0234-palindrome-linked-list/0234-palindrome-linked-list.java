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

    public boolean isPalindrome(ListNode head) {

        if(head.next == null){
            return true;
        } 
        
        //head.next == null || head.next.next == null) {
            
       // }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = reverse(slow.next);
        slow.next = temp;

        ListNode p1 = head;
        ListNode p2 = slow.next;

        while(p2 != null) {
            
            if(p1.val != p2.val) {
                return false;
            }
            
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}