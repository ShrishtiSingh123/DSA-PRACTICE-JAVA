package Strings;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    public static void main(String[] args) {
        Parentheses obj = new Parentheses();
        List<String> result = obj.gp(5);

        System.out.println(result);
    }
    public void generate(int n, int l, int r, String s, List<String> ans){
        if (r==n){
            ans.add(s);
            return;
        }
        if(l<n)
            generate(n,l+1,r,s+"(",ans);
          if(r<l)
            generate(n,l+1,r+1,s+")",ans);
    }
    public List<String> gp(int n){
        List<String> ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
}
