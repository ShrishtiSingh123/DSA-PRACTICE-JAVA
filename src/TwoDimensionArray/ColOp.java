package TwoDimensionArray;

public class ColOp {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{3,45,5,1},{9,4,3,6}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
