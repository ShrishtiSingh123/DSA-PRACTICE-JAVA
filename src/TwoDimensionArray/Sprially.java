package TwoDimensionArray;

import java.util.ArrayList;

public class Sprially {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> spiral(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m=arr.length; int n=arr[0].length;
        int FirstRow=0;
        int FirstCol=0;
        int LastRow=m-1;
        int LastCol=n-1;
        while(FirstRow<=LastRow&&FirstCol<=LastCol) {
            for (int j = FirstRow; j <= LastRow; j++) {
                ans.add(arr[FirstRow][j]);
                FirstRow++;
                if(FirstRow>LastRow|| FirstCol>LastCol) break;
            }
            for (int i = FirstCol; i <= LastCol; i++) {
                ans.add(arr[i][LastCol]);
                LastCol--;
                if(FirstRow>LastRow|| FirstCol>LastCol) break;
            }
            for (int j = LastCol; j >= FirstCol; j--) {
                ans.add(arr[LastRow][j]);
                LastRow--;
                if(FirstRow>LastRow|| FirstCol>LastCol) break;
            }
            for (int i = LastRow; i >= FirstRow; i--) {
                ans.add(arr[i][FirstCol]);
                FirstCol++;
            }
        }


        return ans;
    }
}
