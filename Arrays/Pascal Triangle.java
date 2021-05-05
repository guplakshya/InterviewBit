######### Pascal Triangle ###########

/*

Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

*/

Java Solution:

public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==i || j==0)
                    temp.add(1);
                else
                    temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            res.add(temp);
        }
        return res;
    }
    
    
    
    
