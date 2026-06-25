package Array;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {4, 10, 10, 6, 3, 8};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // Step 1: Find max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Find second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + smax);
    }
}