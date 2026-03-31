package Pattern;

public class Diamond {
    public static void main(String[] args) {
diamond(5);
    }

    static void diamond(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalInRow = (row < n) ? row + 1 : 2 * n - row - 1;
            int numberofspaces=n-totalInRow;
            for(int s=0;s<numberofspaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
