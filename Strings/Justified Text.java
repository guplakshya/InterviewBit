################ Justified Text ###############

/*

Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
You should pack your words in a greedy approach; that is, pack as many words as you can in each line.

Pad extra spaces ‘ ‘ when necessary so that each line has exactly L characters.
Extra spaces between words should be distributed as evenly as possible.
If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
For the last line of text, it should be left justified and no extra space is inserted between words.

Your program should return a list of strings, where each string represents a single line.

*/

Java Solution:

public ArrayList fullJustify(ArrayList A, int B) {
    int space =0;
    int lenstr=B;
    int ltrcount=0;
    ArrayList resul=new ArrayList();
    ArrayList temp=new ArrayList();
    for(int i=0;i<A.size();i++){
        int ext=0;
        int count=0;
        space=0;
        temp.clear();
        String ltr=A.get(i);
        count=ltr.length();
        temp.add(ltr);
        while(count<=B){
        space++;
        count++;
          if(i==A.size()-1){
          ext=0;
          break;
          }
        i++;
        String mtr=A.get(i);
        count+=mtr.length();
        temp.add(mtr);
        ext=1;
        }
    if(ext==1){
    count-=A.get(i).length();
    temp.remove(temp.size()-1);
    space--;
    i--;
    }
    count--;
    int val=count-space;
    String calval="";
    int ecspace=0;
    if(space!=0)
    ecspace=(B-val)%space;
    int spreq=0;
    if(space!=0)
    spreq=(B-val)/space; if(i==A.size()-1){
    ecspace=0;
    spreq=1;
    }
    int k;
    for(k=0;k<temp.size();k++){
    calval+=temp.get(k);
    int p=0;
    if(k!=temp.size()-1){
    while(p<spreq){
    calval+= " ";
    p++;
    }
}
    if(ecspace>0){
    calval+=" ";
    ecspace--;
    }
    } while(calval.length()<B){
    calval+=" ";
    } resul.add(calval);
    }
    return resul;
}


