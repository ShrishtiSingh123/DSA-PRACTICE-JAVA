package Array;
import java.util.Arrays;
public class Sort {
    public static void main(String args[]){
    int [] arr={2,3,5,4,-1,-3};
    print(arr);
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
