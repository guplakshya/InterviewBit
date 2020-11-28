########## First Missing Integer ##########

/*

Given an unsorted integer array, find the first missing positive integer.

*/

Java Solution:

public int firstMissingPositive(ArrayList<Integer> A) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<A.size();i++){
            if(A.get(i)>0){
                map.put(A.get(i),map.get(A.get(i)) == null ? 1 : map.get(A.get(i))+1);
            }
        }
        int index =1;
        while(true){
            if(!map.containsKey(index)){
                return index;
            }
            index++;
        }
    }
