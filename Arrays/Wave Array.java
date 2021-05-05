########## Wave Array ############

/*

Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

*/

Java Solution:

public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            int tmp = A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,tmp);
        }
        return A;
    }
