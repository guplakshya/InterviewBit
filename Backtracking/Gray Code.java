################# Gray Code ####################

/*

The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

*/

Java Solution:

public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> res = new ArrayList<>();
        num = 0;
        grayCodeUtil(res,a);
        return res;
    }
    int num;
    public void grayCodeUtil(ArrayList<Integer>res,int n){
        if(n==0){
            res.add(num);
            return;
        }
        grayCodeUtil(res,n-1);
        num = num^(1<<(n-1));
        grayCodeUtil(res,n-1);
    }
    
    
