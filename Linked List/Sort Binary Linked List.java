################## Sort Binary Linked List ####################

/*

Given a Linked List A consisting of N nodes.

The Linked List is binary i.e data values in the linked list nodes consist of only 0's and 1's.

You need to sort the linked list and return the new linked list.

*/

Java Solution:

public ListNode solve(ListNode A) {
        ListNode iter = A;
        ListNode one = A;
        while(iter!=null){
            if(iter.val==0){
                iter.val = one.val;
                one.val = 0;
                one = one.next;
                iter = iter.next;
            }else{
                iter = iter.next;
            }
        }
        return A;
    }
