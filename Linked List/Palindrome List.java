 ################ Palindrome List ####################
 
 /*
 
 Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
 
 */
 
 Java Solution:
 
  public int lPalin(ListNode A) {
        ListNode slow = A;
        Stack<Integer> stack = new Stack<>();
        int flag =1;
        while(slow!=null){
            stack.push(slow.val);
            slow = slow.next;
        }
        while(A!=null){
            int x = stack.pop();
            if(A.val == x)
                flag = 1;
            else{
                flag = 0;
                break;
            }
            A = A.next;
        }
        return flag;
    }
