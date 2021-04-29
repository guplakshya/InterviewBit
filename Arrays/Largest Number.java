############ Largest Number ############

/*

Given a list of non negative integers, arrange them such that they form the largest number.

Example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

*/

Java Solution:

public String largestNumber(final List<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                String XY = s1+s2;
                String YX = s2+s1;
                return XY.compareTo(YX) > 0 ? -1:1;
            }
        });
        pq.addAll(A);
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        return sb.charAt(0) == '0' ? "0": sb.toString();
    }
    
    
