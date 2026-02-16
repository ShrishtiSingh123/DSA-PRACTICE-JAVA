package conditionloop;
import java.util.Scanner;
public class fibseries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int a=0;
        int b=1;
        int n=input.nextInt();
        System.out.println("enter fibonacci number"+a);
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }

        System.out.println("Enter fib series"+b);
    }
}
