import java.util.*;
public class Kadnens {
    public static void main(String[] args) {
        int arr[]={7,1,-9,4,10};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;

            }
        }
        System.out.println(max);

    }
}