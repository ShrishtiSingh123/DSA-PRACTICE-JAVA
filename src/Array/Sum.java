package Array;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      int[] arr={4 ,4 ,6,9,2};
      int sum=0;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
        System.out.println(sum);
    }
}
