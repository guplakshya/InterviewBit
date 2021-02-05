############# 2 Sum ################

/*

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

*/

Java Solution:

public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(map.containsKey(B-A.get(i))){
                list.add(map.get(B-A.get(i))+1);
                list.add(i+1);
                break;
            }
            else if(!(map.containsKey(A.get(i)))){
                map.put(A.get(i),i);
            }
        }
    return list;
    }
