package Recursion;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
int arr[]={1,4,5,6,3,};
sortArray(arr,arr.length);
System.out.println(Arrays.toString(arr));
    }
     static void sortArray(int[] arr,int n){
/// base  condition
        if(n==0) {
            return;
        }// sorting logic
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sortArray(arr,n-1);
    }
}
