################ Evaluate Expression ##################

/*

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

*/

Java Solution:

public int evalRPN(ArrayList<String> A) {
        Stack <Integer> st = new Stack<>();
        int n = A.size();
        for (int i=0; i<A.size(); i++) {
            if ("*/-+".contains(A.get(i))) {
                int a = st.pop();
                int b = st.pop();
                
                if (A.get(i).equals("+")) {
                    st.push(b+a);
                }
                else if (A.get(i).equals("-")) {
                    st.push(b-a);
                }
                else if (A.get(i).equals("*")) {
                    st.push(b*a);
                }
                else {
                    st.push(b/a);
                }
            }
            else {
                st.push(Integer.parseInt(A.get(i)));
            }
        }
        
        return st.peek();
     }
     
     
