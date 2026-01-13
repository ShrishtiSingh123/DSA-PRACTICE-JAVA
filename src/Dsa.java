//public class Dsa {
//
//    public static void bubblesort(int arr[]) {
//        for (int turn = 0; turn < arr.length - 1; turn++) {
//            for (int i = 0; i < arr.length - 1 - turn; i++) {
//
//                // FIXED: removed wrong semicolon
//                if (arr[i] > arr[i + 1]) {
//
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void printarr(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    // FIXED: main method inside class
//    public static void main(String[] args) {
//        int arr[] = {5, 4, 1, 3, 2, 3};
//
//        Dsa.bubblesort(arr);
//        Dsa.printarr(arr);
//    }
//}

//import java.util.*;
//
//public class Dsa {
//    public static void main(String[] args) {
//
//        int arr[] = {6, 2, 6, 6, 4, 2, 6};
//        int n = arr.length;
//
//        // Step 1: Find maximum element
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        // Step 2: Create count array
//        int[] count = new int[max + 1];
//
//        // Step 3: Store frequency of each number
//        for (int i = 0; i < n; i++) {
//            count[arr[i]]++;
//        }
//
//        // Step 4: Put values back to arr[] in sorted order
//        int k = 0;
//        for (int i = 0; i <= max; i++) {
//            while (count[i] > 0) {
//                arr[k++] = i;
//                count[i]--;
//            }
//        }
//
//        // Step 5: Print sorted array
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
//
import java.util.*;
public class Dsa {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,2,1,3,9};
        bubbleSort(arr);
        printArray(arr);

    }
}

