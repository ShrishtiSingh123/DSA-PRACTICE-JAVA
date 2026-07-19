package TwoDimensionArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
       int [][]arr={{1,2,3},{4,7,8},{5,9,78}};
       System.out.println();
       print(arr);
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
        System.out.println();
       print(arr);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
