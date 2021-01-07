################# Balanced Parantheses ####################

/*

Given a string A consisting only of '(' and ')'.

You need to find whether parantheses in A is balanced or not ,if it is balanced then return 1 else return 0.

*/

Java Solution:

public int solve(String A) {
        int open=0;
        for(char ch:A.toCharArray()) {
            if(ch=='(') 
                open++;
            else if(ch==')' && open >0) 
                open--;
            else if(ch==')' && open <=0) 
                return 0;
        }
    return (open==0)?1:0;
    }
    
