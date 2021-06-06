################# Longest Palindromic Substring ##################

/*

Given a string S, find the longest palindromic substring in S.

*/

Java Solution:

public String longestPalindrome(String A) {
        if(A == null || A.length() < 1) return "";
        int start=0,end=0,maxlen=0;
        for (int i = 0 ; i < A.length(); i++) {
            int len1 = palindromeCenter(A,i,i);
            int len2 = palindromeCenter(A,i,i+1);
            if(maxlen < Math.max(len1,len2)){
                int len = Math.max(len1,len2);
                if(len > end - start){
                    start = i - (len-1)/2;
                    end = i + (len)/2;
                }
                maxlen = len;
            }
        }
        return A.substring(start,end+1);
    }
    public static int palindromeCenter(String A,int start,int end){
        if(A.length()==0)
            return 0;
        while(start>=0 && end< A.length() && A.charAt(start)==A.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
    
    
