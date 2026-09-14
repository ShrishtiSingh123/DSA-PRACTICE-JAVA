package Maps_Set_Map;

import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!map.containsKey(ch)) return false;
            int freq=map.get(ch);
            map.put(ch,freq-1);
        }
        return true;
    }
}
