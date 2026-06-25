package Array;

public class Min {
    public static void main(String[] args) {
        int[]arr={6,9,87,45,76};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
