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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        
        // Calculate the length of the linked list
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        // Calculate the base length of each part and the remainder
        int baseLen = length / k;
        int remainder = length % k;

        curr = head;
        ListNode[] result = new ListNode[k];
        
        // Iterate through each part
        for (int i = 0; i < k; i++) {
            result[i] = curr;
            int partSize = baseLen + (i < remainder ? 1 : 0);

            // Traverse to the end of the current part
            for (int j = 0; j < partSize - 1 && curr != null; j++) {
                curr = curr.next;
            }

            // Move to the next part
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return result;
    }
}
