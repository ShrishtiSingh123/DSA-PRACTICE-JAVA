package TwoDimensionArray;

public class HW {
    public static void main(String[] args) {
        int [][] arr={{1,5,4,6},{3,2,5,8},{9,4,2,7}};
        int minOfMax=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int rowMax=arr[i][0];
            for(int j=1;j<arr[i].length;j++){
if(rowMax<arr[i][j]){
    rowMax=arr[i][j];
}
            }
            if(minOfMax<rowMax){
            minOfMax=rowMax;
            }
        }
        System.out.println(minOfMax);
    }
}
