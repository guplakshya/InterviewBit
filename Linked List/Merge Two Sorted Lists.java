########################### Merge two Sorted Lists #####################

/*

Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

*/

Java Solution:

public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A==null)
            return B;
        if(B==null)
            return A;
        if(A.val<B.val){
            A.next = mergeTwoLists(A.next,B);
            return A;
        }
        else{
            B.next = mergeTwoLists(A,B.next);
            return B;
        }
    }
    
    
    
