############## Square Root of Integer #####################

/*

Given an integar A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

*/

Java Solution:

public int sqrt(int A) {
        if(A==0 || A==1)
            return A;
        int start=1,end=A/2,ans=0;
        while(start<=end){
            int mid = (end+start)/2;
            if(mid*mid == A)
                return mid;
            if(mid*mid < A){
                start = mid+1;
                ans = mid;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    
    
    
