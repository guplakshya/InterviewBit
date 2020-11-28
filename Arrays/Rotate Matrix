########## Rotate Matrix ###############

/*

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

*/

Java Solution:

public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(i).get(n-j-1));
                a.get(i).set(n-j-1,temp);
            }
        }
    }
    
    
    
