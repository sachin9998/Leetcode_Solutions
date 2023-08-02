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
    public ListNode middleNode(ListNode head) {
        
        
        // Calculating length of Node
        int count = 0;
        ListNode current = head;

        

        while(current != null) {
            count++;
            current = current.next;
        }

        // Edge Cases
        if(count == 1) {
            return head;
        }

        // Finding Middle Index
        int mid;
        if(count / 2 == 0) {
            mid = (count / 2) + 1;
        } else {
            mid = count / 2;
        }

        // Traversing till middle Node
        ListNode middle = head;
        for(int i = 0; i < mid; i++) {
            middle = middle.next;
        }

        return middle;
    }
}