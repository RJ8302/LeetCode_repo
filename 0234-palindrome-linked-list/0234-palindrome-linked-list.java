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
//     public ListNode findMid(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow; 
//     }

//     public ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next;

//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode next;
        while(slow != null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode right = prev;
        ListNode left = head;
        
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
}