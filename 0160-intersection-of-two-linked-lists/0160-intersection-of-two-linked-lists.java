/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int aLength = 0;
        
        ListNode temp = headA;
        while(temp != null) {
            aLength++;
            temp = temp.next;
        }

        int bLength = 0;
        
        temp = headB;
        while(temp != null) {
            bLength++;
            temp = temp.next;
        }
        
        // int startIndex = aLength > bLength ? aLength - bLength : bLength - aLength;
        ListNode a = headA;
        ListNode b = headB;

        if(aLength > bLength) {
            int index = aLength - bLength;
            for(int i = 0; i < index; i++) {
                a = a.next;
            }
        } else {
            int index = bLength - aLength;
            for(int i = 0; i < index; i++) {
                b = b.next;
            }
        }

        while(a != null || b != null) {
            if(a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return null;
    }
}