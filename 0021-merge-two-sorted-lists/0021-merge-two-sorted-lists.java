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
        ListNode top = list1;
        ListNode down = list2;

        ListNode head = new ListNode(100);
        ListNode temp = head;

        while(top != null && down != null) {
            if(top.val < down.val) {
                temp.next = top;
                temp = top;
                top = top.next;
            } else {
                temp.next = down;
                temp = down;
                down = down.next;
            }
        }

        if(top == null) {
            temp.next = down;
        } else{
            temp.next = top;
        }

        return head.next;
    }
}