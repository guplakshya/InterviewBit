################## Diffk II ###################

/*

Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

*/

Java Solution:

public int diffPossible(final List<Integer> A, int B) {
        if (A.size() <= 1) 
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (set.contains(num + B) || set.contains(num - B)) {
                return 1;
            }
            set.add(num);
        }
        return 0;
    }
    
    
    
