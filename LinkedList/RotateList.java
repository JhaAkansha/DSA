/*
 * Given the head of a linked list, rotate the list to the right by k places.
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode start = head, end = head, curr = head;
        int count = 0;
        if(head == null || head.next == null)
            return head;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        while(end.next != null){
            end = end.next;
        }
        end.next = head; //ending point
        int i = 0;
        k %= count;
        while(i < count - k - 1){
            i++;
            start = start.next;
        }
        ListNode newhead = start.next;
        start.next = null;
        return newhead;
    }
}