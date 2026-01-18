import java.util.Scanner;
public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rupees=input.nextDouble();
        double usd=rupees/83;
        System.out.println("USD Rupees: "+usd);

    }
}