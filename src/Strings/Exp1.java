package Strings;

import java.util.ArrayList;

import static Array.Passing.change;

public class Exp1 {
    public static void main(String[] args) {
        String s="Shrishti";
        change(s);
        System.out.print(s);
        String arr[]={"Ram","Sham","Om","Jai"};
        ArrayList<String> al=new ArrayList<String>();
        al.add("Krish");
        al.add("Riya");
        System.out.println(al);
        change2 (al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("Siya");
    }

    private static void change(String s){
        s="lobe";
    }
}
