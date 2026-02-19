package linearSearch;

import java.util.Arrays;

public class Search2darray {
    public static void main(String[] args) {
        int arr[][]={
                {12,23,1},
                {1,2},
                {78,98,5,34,46},
                {18,67}
        };
        int target=34;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};


    }
}
