############# Number of 1 bits ############

/*

Write a function that takes an unsigned integer and returns the number of 1 bits it has.

*/

Java Solution:

public int numSetBits(long a) {
        int ans = 0;
        while(a!=0){
            a = a&(a-1);
            ans++;
        }
        return ans;
    }
    
    
