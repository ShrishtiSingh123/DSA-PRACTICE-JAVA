package TwoDimensionArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
       int [][]arr={{1,2,3,4},{4,7,8,5},{5,9,78,6,2}};
       print(arr);
    }

    public static void print(int[][] arr) {
        for(int []a:arr){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
