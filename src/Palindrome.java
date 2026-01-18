import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner String=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= String.nextLine();
            str=str.replaceAll("\\s"," ").toLowerCase();

                String reverse=new StringBuilder(str).reverse().toString();
                if(str.equals(reverse)){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not Palindrome");

                }

    }

}