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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode nxtPair;
        ListNode second;

        while(curr!=null && curr.next!=null){
            //save pointers
            nxtPair = curr.next.next;
            second = curr.next;

            //reverse this pair
            second.next =  curr;
            curr.next = nxtPair;
            prev.next = second;

            //update pointer
            prev = curr;
            curr = nxtPair;
        }
        return dummy.next;
    }
}