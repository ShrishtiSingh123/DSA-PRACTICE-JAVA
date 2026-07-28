package Recursion;

import java.util.Scanner;

public class  factorial {
    public static void main(String args[])
    {
        int n=5;
       int result= factorial(n);
       System.out.println(result);
    }
    static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
   return n*factorial(n-1);
    }
}
