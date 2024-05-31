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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            while(!s.isEmpty() && curr.val > s.peek()){
                s.pop();
            }
            s.push(curr.val);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        curr = dummy;
        for(int n : s){
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return dummy.next;
    }
}