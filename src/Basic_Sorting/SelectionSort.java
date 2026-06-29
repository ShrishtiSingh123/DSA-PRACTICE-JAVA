package Basic_Sorting;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []arr={5,-2,6,7,2,0,7,2};
        int n=arr.length;
        print(arr);
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println();
        print(arr);
    }
}
