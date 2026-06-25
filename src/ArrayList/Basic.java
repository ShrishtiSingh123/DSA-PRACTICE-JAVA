package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        arr.add(2, 48);

        System.out.println(arr.get(1));

        arr.set(3, 29);

        System.out.println(arr.get(3));
        System.out.println(arr);

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        Collections.reverse(arr);
        System.out.println(arr);
    }
}