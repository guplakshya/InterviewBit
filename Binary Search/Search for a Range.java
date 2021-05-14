################# Search for a Range ################

/*

Given a sorted array of integers A(0 based index) of size N, find the starting and ending position of a given integar B in array A.

Your algorithm’s runtime complexity must be in the order of O(log n).

Return an array of size 2, such that first element = starting position of B in A and second element = ending position of B in A, if B is not found in A return [-1, -1].

*/

Java Solution:

public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int low=0,high = A.size()-1;
        int f = first(A,low,high,B);
        int l = last(A,low,high,B);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(f);
        list.add(l);
        return list;
    }
    public int first(List<Integer> a,int low,int high,int x){
        low=0;
        high = a.size()-1;
        if(low<=high){
            int mid = low + (high-low)/2;
            if((mid == 0 || x > a.get(mid-1)) && a.get(mid) == x){
                return mid;
            }
            if(x> a.get(mid))
                return first(a,mid+1,high,x);
            else
                return first(a,low,mid-1,x);
        }
        return -1;
    }
    public int last(List<Integer> a,int low,int high,int x){
        if(low<=high){
            int mid = low + (high-low)/2;
            if((mid == a.size() - 1 || x < a.get(mid+1)) || a.get(mid) == x){
                return mid;
            }
            if(x> a.get(mid))
                return last(a,mid+1,high,x);
            else
                return last(a,low,mid-1,x);
        }
        return -1;
    }
    
    
    
