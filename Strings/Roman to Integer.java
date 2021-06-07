 ########### Roman to Integer ####################
 
 /*
 
 Given a string A representing a roman numeral.
Convert A into integer.

A is guaranteed to be within the range from 1 to 3999.
 
 */
 
 Java Solution:
 
 public int romanToInt(String A) {
        int sum =0;
        if(A.length()==0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i=0;i<A.length()-1;i++){
            if(map.get(A.charAt(i))<map.get(A.charAt(i+1)))
                sum -= map.get(A.charAt(i));
            else
                sum += map.get(A.charAt(i));
        }
        sum += map.get(A.charAt(A.length()-1));
        return sum;
    }
    
    
