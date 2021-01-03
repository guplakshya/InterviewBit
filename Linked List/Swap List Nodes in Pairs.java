############################ Swap List Nodes in Pairs ##########################

/*

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

*/

Java Solution:

public ListNode swapPairs(ListNode A) {
        if(A == null || A.next == null)
            return A;
            
        ListNode head = A;
        ListNode current = A;
        while(current != null && current.next != null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current = current.next.next;
        }

        return head;
    }
