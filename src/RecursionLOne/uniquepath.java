package RecursionLOne;

public class uniquepath {
    public static int unique(int m,int n) {
        if (n == 1 || m == 1)
            return 1;
            return unique(m - 1, n) + unique(m, n - 1);

    }
    public static void main(String[] args) {
        System.out.println(unique(6,8));

    }
}
