################# Pair with Given Difference ##################

/*

Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.

*/

Java Solution:

public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i=0,j=0;
        while(i<A.size() && j<A.size()){
            int diff = A.get(i) - A.get(j);
            if(diff == B && i!=j)
                return 1;
            else if(diff<B)
                i++;
            else
                j++;
        }
        return 0;
    }
    
    
