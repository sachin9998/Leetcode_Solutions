/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Assigning value of next node to given node
        node.val = node.next.val;

        // Storing reference of next of next node at given.next
        node.next = node.next.next;        
    }
}