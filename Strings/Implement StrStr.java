############ Implement StrStr ################

/*

Implement strStr().

*/

Java Solution:

public int strStr(final String A, final String B) {
        int len = B.length();
        if(len==0)
            return -1;
        if(A.contains(B))
            return A.indexOf(B,0);
        return -1;
    }
    
    
