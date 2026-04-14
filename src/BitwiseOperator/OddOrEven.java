package BitwiseOperator;

public class OddOrEven {
    public static void main(String[] args) {
        int n=89;
        System.out.println(isodd(n));
    }
    public static boolean isodd(int n) {
        return ((n&1)==1);
    }
}
