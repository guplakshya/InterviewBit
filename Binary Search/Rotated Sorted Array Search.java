############# Rotated Sorted Array Search ##################

/*

Given an array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

*/

Java Solution:

public int search(final List<Integer> A, int B) {
        int low=0;
        int high=A.size()-1;
        int result=-1;
        if(low>high)
            return -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A.get(mid) == B){
                result = mid;
                break;
            }
            if(A.get(low)<=A.get(mid)){
                if(B>=A.get(low) && B<=A.get(mid))
                    high = mid-1;
                else
                    low = mid +1;
            }
            else{
                if(B>=A.get(mid) && B<=A.get(high))
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return result;
    }
    
    
    
