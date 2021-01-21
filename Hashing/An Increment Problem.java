#################### An Increment Problem ################

/*

Given a stream of numbers A. On arrival of each number, you need to increase its first occurence by 1 and include this in the stream.

Return the final stream of numbers.

*/

Java Solution:

public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        if(n == 1)  
            return A;
        int p = 0, q = 1;
    
        while(q < n){
            p = 0;
            int val = A.get(q);
            while(p < q){
                if(A.get(p) != val){
                    p++;
                }
                else{
                    A.set(q,A.get(p) + 1);
                    break;
                }
            }
        q++;
        }
    return A;
    }
    
