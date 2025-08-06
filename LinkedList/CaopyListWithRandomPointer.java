/*
 A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 */

 /*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node itr=head;
        Node front=head;

        while(itr!=null){
            front=itr.next;
            Node copy=new Node(itr.val);
            itr.next=copy;
            copy.next=front;
            itr=front;
        }

        itr=head;
        while(itr!=null){
            if(itr.random!=null){
                //System.out.println(itr.next.val);
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }

        itr=head;
        Node ans=new Node(0);
        Node copy=ans;

        while(itr!=null){
            front=itr.next.next;
            copy.next=itr.next;
            itr.next=front;
            copy=copy.next;
            itr=itr.next;
        }
        return ans.next;
    }
}