###################### List Cycle ################

/*

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

*/

Java Solution:

public ListNode detectCycle(ListNode a) {
        Set<ListNode> set = new HashSet<ListNode>();
            if(a.next == null || a == null){
                return null;
            }
            while(a.next != null)
            {
                if(set.contains(a)){
                    return a;
                }
                set.add(a);
                a = a.next;
            }
        return null;
    }
    
    
    
