############# Intersection of Sorted Arrays ################

/*

Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

*/

Java Solution:

public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<A.size() && j<B.size()){
            if(A.get(i).compareTo(B.get(j))==0){
                list.add(A.get(i));
                i++;
                j++;
            }
            else if(A.get(i).compareTo(B.get(j))<0)
                i++;
            else
                j++;
        }
        return list;
    }
    
    
