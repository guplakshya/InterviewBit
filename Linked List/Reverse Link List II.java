############### Reverse Link List II #################

/*

Reverse a linked list from position m to n. Do it in-place and in one-pass.

*/

Java Solution:

public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode temp = new ListNode(0);
        temp.next = A;
        ListNode curr,prev,nextNode;
        prev = temp;
        for(int i=0;i<B-1;i++){
            prev = prev.next;
        }
        curr = prev.next;
        for(int i=0;i<C-B;i++){
            nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        return temp.next;
    }
    
    
    
