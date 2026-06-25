package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr =  {2, 7, 11, 15};
        int target = 9;
        int x=arr.length;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Found at index " + i + " and " + j);
                } else{
                    System.out.println("Not found");
                }
            }
        }
    }
}
