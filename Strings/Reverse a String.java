############### Reverse a String ############

/*

Given a string A.

Return the string A after reversing the string word by word.

*/

Java Solution:

public String solve(String A) {
        String s[] = A.split("\\s");
        int len = s.length;
        String ans = "";
        for(int i=len-1;i>=0;i--){
            ans = ans + " " + s[i];
        }
        return ans.trim().replaceAll("( +)", " ");
    }
    
    
