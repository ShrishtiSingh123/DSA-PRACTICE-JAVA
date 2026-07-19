package TwoDimensionArray;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(2); b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7); c.add(8);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
//        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}