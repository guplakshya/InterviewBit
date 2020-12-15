########### Length of Last Word ###########

/*

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

*/

Java Solution:

public int lengthOfLastWord(final String A) {
        if(A==null)
            return 0;
        
        int len = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
          if (A.charAt(i) == ' ') {
            if (len > 0){
              break;
            }
          } else {
            len++;
          }
        }
        return len;
    }
    
    
