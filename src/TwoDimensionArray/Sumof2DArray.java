package TwoDimensionArray;

public class Sumof2DArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,7,8,5},{5,9,78,6,2}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
          sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

}
