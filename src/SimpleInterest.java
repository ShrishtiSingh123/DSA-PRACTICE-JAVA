import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Principal= input.nextInt();
        int rate= input.nextInt();
        int time= input.nextInt();
        int simple= Principal * rate * time/100;
        System.out.println("Your simple interest is "+simple);
    }
}
