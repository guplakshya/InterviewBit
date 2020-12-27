######################### Remove duplicates from Sorted Array #######################################

/*

Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

*/

Java Solution:

public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()==0 || a.size() == 1)
            return a.size();
        int curr = 0;
        for(int i=0;i<a.size();i++){
            if(!(a.get(i).equals(a.get(curr))))
                a.set(++curr,a.get(i));
        }
        return curr+1;
    }
    
    
