import java.util.*;
public class Selectionsort {
    public static void selectionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos=j;
                    temp = arr[minpos];
                    arr[minpos] = arr[i];
                    arr[i] = temp;
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
        int arr[]={2,1,7,3,9};
        selectionSort(arr);
        printArray(arr);

    }
}