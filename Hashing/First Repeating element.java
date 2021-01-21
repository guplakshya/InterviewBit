############### First Repeating element #######################

/*

Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of first occurrence is smallest.

If there is no repeating element, return -1.

*/

Java Solution:

public int solve(ArrayList<Integer> A) {
    Map<Integer, Integer> freqCounter = new HashMap<>();
    Map<Integer, Integer> indexCounter = new HashMap<>();
    for (int i = 0; i < A.size(); i++) {
      freqCounter.put(A.get(i), freqCounter.getOrDefault(A.get(i), 0) + 1);
      indexCounter.putIfAbsent(A.get(i), i);
    }
    int minRepeatingIndex = Integer.MAX_VALUE;
    for (Integer key : freqCounter.keySet()) {
      if (freqCounter.get(key) > 1) {
        minRepeatingIndex = Math.min(minRepeatingIndex, indexCounter.get(key));
      }
    }
    return minRepeatingIndex == Integer.MAX_VALUE ? -1 : A.get(minRepeatingIndex);
  }
  
