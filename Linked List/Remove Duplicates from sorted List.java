############### Remove Duplicates from sorted List ###############

/*

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

*/

Java Solution:

public ListNode deleteDuplicates(ListNode A) {
        ListNode temp=A;
        while(temp!=null && temp.next!=null)
        {
            if(temp.next.val==temp.val)
            {
                temp.next=temp.next.next;
            }
            else
                temp=temp.next;
        }
        return A;
    }
    
    
    
