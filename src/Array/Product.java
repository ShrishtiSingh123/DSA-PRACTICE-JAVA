package Array;

public class Product {
    public static void main(String args[] ){
        int [] arr={2,3,4,5,6};
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        System.out.println(prod);
    }
}
