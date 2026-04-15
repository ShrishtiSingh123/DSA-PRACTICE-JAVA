package MATH;

public class Seive {
    public static void main(String[] args) {
        int n=40;
        boolean[] isPrime = new boolean[n+1];
        sieve(n,isPrime);
    }
    static void sieve(int n,boolean[] isPrime){
        for(int i=2;i<=n;i++){
            if(!isPrime[i]){
                for(int j=i*2;j<=n;j+=i){
                    isPrime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
