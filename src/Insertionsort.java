//import java.io.*;
//public class Insertionsort {
//public static void  insertionSort(int[] arr)
//{
//    for(int i=1;i<arr.length;i++)
//    {
//        int current=arr[i];
//        int j=i-1;
//        while (j >= 0 && arr[j] > current)
//
//        {
//            arr[j+1]=arr[j];
//            j--;
//        }
//        arr[j+1]=current;
//
//    }
//}
//public static void printArray(int[] arr)
//    {
//    for(int i=0;i<arr.length;i++)
//    {
//        System.out.print(arr[i]+" ");
//    }
//    }
//    public static void main(String[] args) {
//        int arr[] = {2, 1, 3, 6, 7, 5};
//        insertionSort(arr);
//        printArray(arr);
//
//
//
//    }
//}
public class Insertionsort {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 5};
        int n = nums.length;
        int prefix[] = new int[n];

        prefix[0] = nums[0];  // first prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // print prefix array
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
