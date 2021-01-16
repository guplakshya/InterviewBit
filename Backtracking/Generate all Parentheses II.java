##################### Generate all Parentheses II ##################

/*

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.

*/

Java Solution:

public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> list =new ArrayList();
        helper(list,"",A,A);
        return list;
    }
    static void helper(ArrayList list,String s,int l,int r){
        if(l==0 && r==0){
            list.add(s);
            return;
        }
        if(l<0 || r<0 || l>r){
            return;
        }
        helper(list,s+"(",l-1,r);
        helper(list,s+")",l,r-1);
    }
    
    
    
    
