################## Check Palindrome ################

/*

Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

*/

Java Solution:

public int solve(String A) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<A.length();i++)
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0)+1);
        
        int oddCount=0;
        
        for(Map.Entry m : map.entrySet())
        {
            int k=(int)m.getValue();
            
            if((k&1)==1)
                oddCount++;
        }
        
        if(oddCount>1)
            return 0;
            
        return 1;
    }
