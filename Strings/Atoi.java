####### Atoi #############

/*

Implement atoi to convert a string to an integer.

*/

Java Solution:

public int atoi(final String a) {
        String A = a.trim();
        if(A==null || A.length()==0)
            return 0;
        
        double result = 0;
        boolean isNegative = false;
        int start = 0;
        
        if(A.charAt(0)=='+' || A.charAt(0)=='-')
            ++start;
        if(A.charAt(0)=='-')
            isNegative=true;
            
        for(int i=start;i<A.length();i++){
            if(A.charAt(i)<'0' || A.charAt(i)>'9')
                break;
            int digitValue = (int)(A.charAt(i) - '0');
            result = result*10 + digitValue;
        }
        if(isNegative){
            result = -result;
        }
        if(result<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(result>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
    
    return (int)result;
    }
    
    
