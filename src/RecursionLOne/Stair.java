package RecursionLOne;

public class Stair {

    public static int stair(int n) {
        if (n == 0) return 1;
        if (n == 1 || n == 2) return n;

        return stair(n - 1) + stair(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(stair(n));
    }
}