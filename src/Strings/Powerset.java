package Strings;

import java.util.ArrayList;
import java.util.List;

public class Powerset {
    public static void main(String[] args) {
        String s="abc";
        List<String> list=new ArrayList<>();
        subsets("", s, 0,list);
        System.out.println(list);
    }

    private static void subsets(String ans, String s, int i,List<String>list) {
        if(i==s.length()){
            if(ans.length()!=0) list.add(ans);
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        subsets(ans,s,i+1,list);
        subsets(ans +ch ,s,i+1,list);
    }
}
