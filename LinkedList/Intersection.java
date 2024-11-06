/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
If the two linked lists have no intersection at all, return null.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1!= null) {
            temp2 = headB;
            while (temp2 != null) {
                if (temp1 == temp2){
                    return temp1;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;*/
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int c1 = 0, c2 = 0, diff, j;
        while (temp1 != null) {
            c1+=1;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            c2+=1;
            temp2 = temp2.next;
        }
        /*if (c1 == c2){
            return headA;
        }*/
        if (c1 > c2) {
            diff = c1 - c2;
            temp1 = headA;
            temp2 = headB;
            for (j = 0; j< diff; j++) {
                temp1 = temp1.next;
            }
            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2){
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        else {
            diff = c2 - c1;
            temp1 = headA;
            temp2 = headB;
            for (j = 0; j< diff; j++) {
                temp2 = temp2.next;
            }
            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2){
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
        }
    }
        return null;
}
}
