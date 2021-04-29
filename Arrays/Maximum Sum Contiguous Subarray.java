######### Maximum Sum Contiguous Subarray #############

/*

Find the contiguous subarray within an array, A of length N which has the largest sum.

*/

Java Solution:

public int maxSubArray(final List<Integer> A) {
        int max_so_far= A.get(0);
        int max_end_here = A.get(0);
        for(int i=1;i<A.size();i++){
            max_end_here = Math.max(max_end_here+A.get(i),A.get(i));
            if(max_so_far<max_end_here){
                max_so_far = max_end_here;
            }
            if(max_end_here<0){
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
