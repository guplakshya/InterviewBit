########## Find Duplicate in Array ###############

/*

Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

*/

Java Solution:

public int repeatedNumber(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(max<A.get(i)){
                max=A.get(i);
            }
        }
        int[] buck=new int[max+1];
        for(int i=0;i<A.size();i++){
            buck[A.get(i)]++;
            if(buck[A.get(i)]>1){
                return A.get(i);
            }
        }
        return -1;
    }
    
    
    
    
