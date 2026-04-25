package RecursionLOne;

import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n);
    }
    static void print(int x,int n){
       if(x>n)
       return;{
           System.out.println(x);
           print(x+1,n);
       }
    }
}
