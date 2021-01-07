##################### Min Stack ###################

/*

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack.
top() – Get the top element.
getMin() – Retrieve the minimum element in the stack.

*/

Java Solution:

Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    
    public void push(int x) {
        st.push(x);
        if(min.isEmpty() || x<= min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        if(!st.isEmpty()){
            int num = st.pop();
            if(num == min.peek())
                min.pop();
        }
    }

    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        if(min.isEmpty())
            return -1;
        return min.peek();
    }
