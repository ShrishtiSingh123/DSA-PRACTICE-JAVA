package Methods;

import java.util.Scanner;

public class Builtin {
    public static void main(String args[]) {
       System.out.println(Math.sqrt(8));
       System.out.println(Math.abs(-32));
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
int m=Math.max(a,Math.max(b,c));
System.out.println(m);

    }
}
