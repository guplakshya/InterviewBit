############### Subaray with B odd numbers #################

/*

Given an array of integers A and an integer B.

Find the total number of subarrays having exactly B odd numbers.

*/

Java Solution:

public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = 0;
        int currCount = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < n; i++){
            if(A.get(i) % 2 == 1) currCount ++;
            if(map.containsKey(currCount - B)) ans += map.get(currCount - B);
            if(!map.containsKey(currCount)) map.put(currCount, 1);
            else map.put(currCount, 1 + map.get(currCount));
        }
        
        return ans;
    }
