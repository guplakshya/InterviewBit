############ Palindromic Binary Representation ###################

/*

Given an integer A find the Ath number whose binary representation is a palindrome.

*/

Java Solution:

public int solve(int A) {
        Queue<String> q = new LinkedList<>();
        if(A==1)
            return 1;
        A = A-1;
        q.add("11");
        
        while(A-- >0){
            String curr = q.remove();
            if(A==0)
                return stringToInt(curr);
            
            int len = curr.length();
            
            if(len%2==0){
                q.add(curr.substring(0, len / 2) + "0" + curr.substring(len / 2));
                q.add(curr.substring(0, len / 2) + "1" + curr.substring(len / 2));
            }
            else{
                char midChar = curr.charAt(len / 2);
                q.add(curr.substring(0, len / 2) + midChar + curr.substring(len / 2));
            }
        }
        return -1;
    }
    public static int stringToInt(String s){
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1')
                ans += 1 <<i;
        }
        return ans;
    }
    
    
