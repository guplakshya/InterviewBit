######################### First non-repeating character in a stream of characters #####################

/*

Given a string A denoting a stream of lowercase alphabets. You have to make new string B.

B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B. If no non-repeating character is found then append '#' at the end of B.

*/

Java Solution:

public String solve(String A) {
        Set<Character> set = new HashSet<>();
        Queue<Character> q = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(set.contains(ch)){
                q.remove(ch);
            }
            else{
                set.add(ch);
                q.add(ch);
            }
            if(q.isEmpty()){
                ans.append("#");
            }
            else{
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }
    
