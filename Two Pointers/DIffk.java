################### Diffk ###################

/*

Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

*/

Java Solution:

public int diffPossible(ArrayList<Integer> A, int B) {
        int l=0,r=0;
        while(r < A.size()){
            int diff = A.get(r) - A.get(l);
            if(diff == B && r != l) 
                return 1;
            if(diff > B)
                l++;
            else
                r++;
        }
        return 0;
    }
    
    
