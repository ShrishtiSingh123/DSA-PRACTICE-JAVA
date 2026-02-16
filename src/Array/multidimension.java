//package Array;
//
//import java.util.Arrays;
//
//public class multidimension {
//    public static void main(String[] args) {
//        int [][] arr={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//
//        };
//        System.out.println(Arrays.deepToString(arr));
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

public class multidimension  {
	public static void main(String[] args) {
        int [][] arr=new int [3][3];
        Scanner sc=new Scanner(System.in);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){

            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}