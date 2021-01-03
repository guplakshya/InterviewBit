################### Rotate List ############

/*

Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL

*/

Java Solution:

public ListNode rotateRight(ListNode A, int B) {
        ListNode current = A;
        int size = 1;
        while(current.next != null){
            size++;
            current = current.next;
        }
        current.next = A;
        
        int count = size - (B % size);
        while(count-- > 0){
            current = current.next;
        }
        ListNode start = current.next;
        current.next = null;
    return start;
    }
    
    
    
