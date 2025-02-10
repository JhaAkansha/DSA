/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
You may not alter the values in the list's nodes, only nodes themselves may be changed.
*/
/**
 Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;

        while (head != null) {
            ListNode groupStart = head;
            ListNode groupEnd = getGroupEnd(head, k);

            if (groupEnd == null)
                break;

            prevGroupTail.next = reverseList(groupStart, groupEnd.next);
            prevGroupTail = groupStart;
            head = prevGroupTail.next;
        }

        ListNode newHead = dummy.next;
        return newHead;
    }

    private ListNode getGroupEnd(ListNode head, int k) {
        while (head != null && --k > 0)
            head = head.next;
        return head;
    }

    private ListNode reverseList(ListNode head, ListNode stop) {
        ListNode prev = stop;
        while (head != stop) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
