############# Excel Column Title ###############

/*

Given a positive integer A, return its corresponding column title as appear in an Excel sheet.

*/

Java Solution:

public String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while(A>0){
            int rem = A%26;
            if(rem == 0){
                sb.append('Z');
                A = (A/26) -1 ;
            }
            else{
                sb.append((char)((rem-1)+'A'));
                A = A/26;
            }
        }
        return sb.reverse().toString();
    }
    
    
    
