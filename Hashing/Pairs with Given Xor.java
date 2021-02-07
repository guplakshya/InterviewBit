################ Pairs with Given Xor ################

/*

Given an 1D integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

*/

Java Solution:

public int solve(ArrayList<Integer> A, int B) {
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.size();i++){
            if(set.contains(B^A.get(i))){
                count++;
            }
            else{
                set.add(A.get(i));
            }
        }
        return count;
    }
