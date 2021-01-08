################### Largest Rectangle in Histogram ###############

/*

Given an array of integers A of size N. A represents a histogram i.e A[i] denotes height of
the ith histogram’s bar. Width of each bar is 1.

*/

Java Solution:

public int largestRectangleArea(ArrayList<Integer> a) {
        Stack<Integer> stack = new Stack<Integer>();
        int top =0;
        int maxArea =0;
        int areaWithTop;
        int i = 0;
        while(i < a.size()){
            
            if(stack.isEmpty() || a.get(i) >= a.get(stack.peek())){
                stack.push(i);
                i++;
            }
            else {
                top = stack.peek(); 
                stack.pop();
                areaWithTop = a.get(top) * (stack.isEmpty() ? i : i - stack.peek() - 1);
                if(maxArea < areaWithTop) 
                    maxArea = areaWithTop;
            }
        }
        while(!stack.isEmpty()){
            top = stack.peek();
            stack.pop();
            areaWithTop = a.get(top) * (stack.isEmpty() ? i : i - stack.peek() - 1);
            if(maxArea < areaWithTop) 
                    maxArea = areaWithTop;
        }
        return maxArea;
    }

