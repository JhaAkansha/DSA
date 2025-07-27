/*
 Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0, i, idx;
        ListNode temp = head, curr;
        if (temp.next == null) {
            return null;
        }
        while (temp != null) {
            count +=1;
            temp = temp.next;
        }
        idx = count - n;
        temp = head.next;
        curr = head;
        if (idx == 0) {
            head = temp;
        }
        for (i = 1; i<idx; i ++) {
            temp = temp.next;
            curr = curr.next;
        }
        curr.next = temp.next;
        return head;
    }
}