package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s="shiv";
        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
        System.out.println(sb);
        char[] p={'a'};
        sb.insert(3,p);
        System.out.println(sb);
    }
}
