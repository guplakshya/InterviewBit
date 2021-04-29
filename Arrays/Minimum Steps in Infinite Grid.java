################ Minimum Steps in Infinite Grid ################

/*

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

*/

Java Solution:

public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        for(int i=1;i<A.size();i++){
            int x1 = A.get(i-1);
            int x2 = A.get(i);
            int y1 = B.get(i-1);
            int y2 = B.get(i);
            steps += distance(x1,y1,x2,y2);
        }
        return steps;
    }
    public int distance(int x1,int y1,int x2,int y2){
        return Math.max(Math.abs(x2-x1), Math.abs(y2-y1));
    }
    
    
