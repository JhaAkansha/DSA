/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode curr = temp;
        
        while(curr.next != null && curr.next.next != null){
            if(curr.next.val == curr.next.next.val) {
                int duplicate = curr.next.val;
                while(curr.next !=null && curr.next.val == duplicate) {
                    curr.next = curr.next.next;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return temp.next;
    }
}
