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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; 
        ListNode first = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next; 
        slow.next = null;

        ListNode prev = null;
        ListNode next;
        while(second != null){
            next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        second = prev;
        while(second != null){
            ListNode first1 = first.next;
            ListNode second1 = second.next;
            
            first.next = second;
            second.next = first1;

            first = first1;
            second = second1;
        }
    }
}