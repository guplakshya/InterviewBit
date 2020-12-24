################# Single Number ################

/*

Given an array of integers, every element appears twice except for one. Find that single one.

*/

Java Solution:

public int singleNumber(final List<Integer> A) {
        int ans=0;
        for(int i:A)
            ans^=i;
        return ans;
    }
    
    
