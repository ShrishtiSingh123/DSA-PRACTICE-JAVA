import java.util.Scanner;

public class Loops  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            System.out.println(i);
//
//        }
        // while loop
        int num=1;
        while (num<=n){
            System.out.println(num);
            num++;

        }
    }
}