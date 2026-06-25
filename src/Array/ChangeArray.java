package Array;

import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr={2,45,1,7,5,4};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                arr[i]=arr[i]*2;
            }else
            {
                arr[i]+=10;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
