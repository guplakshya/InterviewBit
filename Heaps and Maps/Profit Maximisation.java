####################### Profit Maximisation #####################

/*

Given an array A , representing seats in each row of a stadium. You need to sell tickets to B people.

Each seat costs equal to the number of vacant seats in the row it belongs to. The task is to maximize the profit by selling the tickets to B people.

*/

Java Solution:

public int solve(ArrayList<Integer> A, int B) {
    
    int price=0;
        while(B!=0){
         Collections.sort(A,Collections.reverseOrder());
         price=price+A.get(0);
         if(A.get(0)>0){
             A.set(0,A.get(0)-1);
         }
         else A.remove(A.get(0));
         B--;    
        }
        
        return price;
        
    }
    
    
