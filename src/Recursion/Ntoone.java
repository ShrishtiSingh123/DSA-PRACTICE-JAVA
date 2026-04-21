package Recursion;

public class Ntoone {
    public static void main(String[] args) {
        int n=8;
        numberoutput(n);
    }
    static void numberoutput(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        numberoutput(n-1);
    }
}
