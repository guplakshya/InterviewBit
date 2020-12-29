############## Kth Node From Middle ##############

/*

Given a linked list A of length N and an integer B.

You need to find the value of the Bth node from the middle towards the beginning of the Linked List A.

If no such element exists, then return -1.

*/

Java Solution:

public int solve(ListNode A, int B) {
        ListNode temp = A; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        }
        int n=count/2+1;
        if(n>B){
            int a= (n-B-1);
            for(int i=a;i>0;i--){
                A=A.next;
                }
        return A.val;
        }
    return -1;
    }
    
    
    
