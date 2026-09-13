package Heaps;

class Heap {
    int[] arr;
    int idx = 1;

    int peek() {
        return arr[1];
    }

    void add(int ele) {
        arr[idx++] = ele;

        int root = idx - 1;

        while (root != 1) {
            int parent = root / 2;

            if (arr[parent] > arr[root]) {
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;

                root = parent;
            }
            else {
                break;
            }
        }
    }

    int remove() {

        if (idx == 1) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = arr[1];

        // Move last element to root
        arr[1] = arr[idx - 1];
        idx--;

        int root = 1;

        // Heapify down
        while (root <= size()) {

            int left = 2 * root;
            int right = 2 * root + 1;

            // Only left child exists
            if (right > size()) {
                if (arr[root] > arr[left]) {
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;

                    root = left;
                }
                else {
                    break;
                }
            }

            // Both children exist
            else {
                // Find smaller child
                int minChild;

                if (arr[left] < arr[right])
                    minChild = left;
                else
                    minChild = right;

                // If parent is already smaller, stop
                if (arr[root] <= arr[minChild]) {
                    break;
                }

                // Swap parent with smaller child
                int temp = arr[root];
                arr[root] = arr[minChild];
                arr[minChild] = temp;

                root = minChild;
            }
        }

        return min;
    }

    void display() {
        for (int i = 1; i <= idx - 1; i++)
            System.out.print(arr[i] + " ");
    }

    int size() {
        return idx - 1;
    }

    Heap(int capacity) {
        arr = new int[capacity + 1];
    }
}

public class MinHeap {
    public static void main(String[] args) {

        Heap h = new Heap(10);

        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);

        h.display();
    }
}