############### Anagrams ###################

/*

Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.

*/

Java Solution:

public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            String sortedKey = getSortedKey(A.get(i));
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(i + 1);
        }
    return new ArrayList<>(map.values());
    }
    private String getSortedKey(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
    return String.valueOf(ch);
    }
    
    
