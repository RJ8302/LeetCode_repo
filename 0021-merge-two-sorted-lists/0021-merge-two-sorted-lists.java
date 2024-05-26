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
        ListNode dummy = new ListNode();
        ListNode pnt = dummy;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pnt.next = list1;
                list1 = list1.next;
            }else{
                pnt.next = list2;
                list2 = list2.next;
            }
            pnt = pnt.next;
        }

        if(list1 != null){
            pnt.next = list1;
        }else{
            pnt.next = list2;
        }

        return dummy.next;
    }
}