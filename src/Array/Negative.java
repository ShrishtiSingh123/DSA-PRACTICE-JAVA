package Array;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        int[] arr=new  int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            for(int i = 0; i <n; i++){
                if(arr[i]<0){
                    System.out.println(arr[i]);
                }
            }
        }
    }

