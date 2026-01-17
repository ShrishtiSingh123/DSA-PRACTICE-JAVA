//import  java.util.Scanner;
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int a=0,b=1;
//        int count=2;
//
//        while(count<n){
//            int temp=b;
//            b=a+b;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}

// fib series
//import  java.util.Scanner;
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = input.nextInt();
//        int a = 0;
//        int b = 1;
//        while(a<=n){
//            System.out.println(a);
//            int temp = a+b;
//            a=b;
//            b=temp;
//        }
//
//    }
//}

// fib no & series
import  java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci"+n);
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(n + "fibonacci no "+a);
    }

}