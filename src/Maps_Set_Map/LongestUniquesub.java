package Maps_Set_Map;

import java.util.HashSet;

public class LongestUniquesub {
    int LongestUniquesubstring(String s){
        HashSet<Character> set=new HashSet<>();
       int  i=0; int j=0; int maxlength=1;
       while(i<s.length()){
           char ch=s.charAt(i);
           if(!set.contains(ch)){
               set.add(ch);
               j++;
           }
           else{
               int length=j-i;
               maxlength=Math.max(length,maxlength);
               while(s.charAt(i)!=s.charAt(j)){
                   set.remove(s.charAt(i));
                   i++;
               }
               i++;
               j++;
           }
       }
int length=j-i;
       maxlength=Math.max(length,maxlength);
       return maxlength;
    }
}
