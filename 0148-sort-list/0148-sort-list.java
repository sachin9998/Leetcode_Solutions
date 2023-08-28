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
    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find middle node
        ListNode mid = getMiddle(head);
        ListNode midNext = mid.next;
        
        // Break into two parts
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        
        return merge(left, right);
    }

    // Merge two sorted linked list
    public ListNode merge(ListNode left, ListNode right) {

        //  if(left == null) {
        //      return right;
        //  } 

        //  if(right == null) {
        //      return left;
        //  }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (left != null && right != null) {
            
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } 
            
            else {
                current.next = right;
                right = right.next;
            }
            
            current = current.next;
        }
        
        if (left != null) {
            current.next = left;
        }
        
        if (right != null) {
            current.next = right;
        }
        
        return dummy.next;
    }

    // Method to Finding middle node
    public ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

}