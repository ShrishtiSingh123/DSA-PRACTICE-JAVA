package Recursion;

public class OnetoN {
    public static void main(String[] args) {
 int n=8;
 numberoutput(n);
    }
    static void numberoutput(int n){
        if(n==1){
            return ;
        }
        numberoutput(n-1);
        System.out.println(n);
    }
}
