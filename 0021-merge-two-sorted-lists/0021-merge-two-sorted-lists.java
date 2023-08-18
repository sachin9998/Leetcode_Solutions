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

        // Pointers
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        // Answer List
        ListNode head = new ListNode(100);
        ListNode temp3 = head;

        while(temp1 != null && temp2 != null) {
            if(temp1.val < temp2.val) {
                ListNode curr = new ListNode(temp1.val);
                temp3.next = curr;
                temp3 = curr;
                temp1 = temp1.next;
            } else{
                ListNode curr = new ListNode(temp2.val);
                temp3.next = curr;
                temp3 = curr;
                temp2 = temp2.next;
            }
        }

        if(temp1 == null) {
            temp3.next = temp2;
        } else {
            temp3.next = temp1;
        }
        
        return head.next;
    }
}