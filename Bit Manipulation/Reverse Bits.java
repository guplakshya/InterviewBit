############### Reverse Bits #############

/*

Reverse the bits of an 32 bit unsigned integer A.

*/

Java Solution:

public long reverse(long a) {
        long sum = 0;
        int i = 31;
        while(a!=0){
            sum += Math.abs((a&1)*(1<<i));
            a = a>>1;
            i--;
        }
        return sum;
    }
    
    
    
