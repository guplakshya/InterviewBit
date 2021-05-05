########### Spiral Order Matrix II ##############

/*

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.

*/

Java Solution:

public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int[][] res = new int[A][A];
        int left=0,right=A-1,top=0,bottom=A-1,num=1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++)
                res[top][i] = num++;
            top++;
            
            for(int i=top;i<=bottom;i++)
                res[i][right] = num++;
            right--;
            
            for(int i=right;i>=left;i--)
                res[bottom][i] = num++;
            bottom--;
            
            for(int i=bottom;i>=top;i--)
                res[i][left] = num++;
            left++;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j=0;j<A;j++){
                tmp.add(res[i][j]);
            }
            ans.add(tmp);
        }
        return ans;
    }
    
    
    
