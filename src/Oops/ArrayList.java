package Oops;

class MyArrayList {
    int arr[];
    int idx = 0;

    MyArrayList(int capacity) {
        arr = new int[capacity];
    }

    void add(int element) {
        if (idx == arr.length) {
            int arr2[] = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = element;
    }

    int capacity() {
        return arr.length;
    }

    int get(int index) {
        if (index >= idx) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return arr[index];
    }

    void display() {
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayList {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList(3);

        System.out.println(arr.capacity()); // 3

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display(); // 10 20 30

        System.out.println(arr.get(1)); // 20

        arr.add(40); // triggers resize
        arr.add(50);

        arr.display(); // 10 20 30 40 50
        System.out.println(arr.capacity()); // 6
    }
}