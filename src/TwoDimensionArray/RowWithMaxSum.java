package TwoDimensionArray;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args){
        int [][] arr={{2,4,7},{9,4,3,2},{1,2,4,5}};
        int maxSum=0;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
for(int j=0;j<arr[0].length;j++){
sum+=arr[i][j];
}
if(sum>maxSum){
    maxSum=sum;
    row=i;
}
maxSum=Math.max(maxSum,sum);
        }
        System.out.println( row+" "+maxSum);
    }
}
