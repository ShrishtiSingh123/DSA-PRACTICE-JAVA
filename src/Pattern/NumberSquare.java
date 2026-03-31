package Pattern;

public class NumberSquare {
    public static void main(String[] args) {
        numberSquare(4);
    }

    static void numberSquare(int n){
        int size = 2 * n - 1;   // don't overwrite n

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){

                int atEveryIndex = Math.min(
                        Math.min(row, col),
                        Math.min(size - row - 1, size - col - 1)
                );

                int value = n - atEveryIndex;  // convert to positive

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}