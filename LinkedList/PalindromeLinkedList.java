/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
*/

/*
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
    public boolean isPalindrome(ListNode head) {
        if( head.next==null){
            return true;
        }
        ListNode midNode= middleNode ( head); 
        ListNode prev = null;
        ListNode curr= midNode;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        
        ListNode left = head;    
        ListNode right = prev; 
        while(right!= null){
            if (right.val != left.val){  
                return false;   
            }
            left= left.next;
            right= right.next;
        }
        return true;
        
    }
    public ListNode middleNode (ListNode head) {
        ListNode slow= head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow= slow.next;  
            fast= fast.next.next;    
        }

        return slow;   
    }
}
