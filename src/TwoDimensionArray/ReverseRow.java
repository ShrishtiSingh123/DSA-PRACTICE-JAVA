package TwoDimensionArray;

public class ReverseRow {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length-1; j >=0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < matrix[0].length; j++) {
//            System.out.print(matrix[0][j] + " ");
            for (int i =  matrix.length-1; i >=0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
