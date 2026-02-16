package AssignmentArray;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6};
        int ans[]=new int[arr1.length+arr2.length];
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            ans[ind++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            ans[ind++]=arr2[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
