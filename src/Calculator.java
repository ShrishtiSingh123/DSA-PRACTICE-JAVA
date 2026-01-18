import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        String operator = input.next();   // ✅ FIX

        if (operator.equals("+")) {
            System.out.println("Your result is " + (a + b));
        }
        else if (operator.equals("-")) {
            System.out.println("Your result is " + (a - b));
        }
        else if (operator.equals("*")) {
            System.out.println("Your result is " + (a * b));
        }
        else if (operator.equals("/")) {
            System.out.println("Your result is " + (a / b));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
