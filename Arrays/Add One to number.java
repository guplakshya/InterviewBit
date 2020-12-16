######### Add One to Number #############

/*

Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

*/

Java Solution:

public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int i=0;
        while(i<= A.size()-1 && A.get(i)==0) 
        A.remove(i);
        int carry = 1;
        for(i=A.size()-1;i>=0;i--){
            int tmp = A.get(i)+carry;
            if(tmp>9){
                A.set(i,tmp%10);
                carry = 1;
            }else{
                A.set(i,tmp);
                carry = 0;
                break;
            }
        }
        if(carry > 0) A.add(0,carry);
        return A;
    }
    
    
