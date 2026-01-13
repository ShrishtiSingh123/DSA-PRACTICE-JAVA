import  java.util.ArrayList;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int salary=input.nextInt();
        if(salary>25000){
            salary=salary+5000;
        }
        else {
            salary=25000+1000;
        }
        System.out.println("Salary is: "+salary);
    }
}