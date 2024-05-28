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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }
        int count = 0;
        boolean link = false;

        while(head != null){
            int data = head.val;
            if(s.contains(data) && link == false){
                count++;
                link = true;
            }
            if(!s.contains(data) && link == true){
                link = false;
            }
            head = head.next;
        }
        return count;
    }
}