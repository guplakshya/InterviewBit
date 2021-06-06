 ############## Longest Common Prefix #################
 
 /*
 
 Given the array of strings A,
you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1
and S2.
 
 */
 
 Java Solution:
 
 public String longestCommonPrefix(ArrayList<String> A) {
        if(A==null || A.size()==0)
            return "";
        if(A.size() == 1)
            return A.get(0);
            
        int len = A.size();
        int minimum = Integer.MAX_VALUE;
        
        for(int i=0;i<len-1;i++){
            String s1 = A.get(i);
            String s2 = A.get(i+1);
            
            int j=0;
            int m = Math.min(s1.length(),s2.length());
            
            while(j<m && s1.charAt(j)==s2.charAt(j))
                j++;
            
            minimum = Math.min(minimum,j);
        }
    
    String pre = (A.get(0)).substring(0,minimum);
    
    return pre;
            
    }
    
    
