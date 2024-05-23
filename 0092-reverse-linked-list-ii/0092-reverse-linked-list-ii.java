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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = dummy;
        ListNode curr = head;
        ListNode prev = null; 
        ListNode next;
        int j = 1;
        while(j != left){
            leftPrev = curr;
            curr = curr.next;
            j++;
        }
        
        for(int i=0; i<right-left+1; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;
    }
}