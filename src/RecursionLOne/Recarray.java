package RecursionLOne;

public class Recarray {
    public static void main(String[] args) {
        int arr[]={5,3,7,12,45,6};
        recPrint(arr,0);
        int target=3;
        System.out.println(exist(arr,target,0));
    }
    public static void recPrint(int arr[],int idx){
        int n=arr.length;
        if(idx==n) return;
        System.out.println(arr[idx]+" ");
        recPrint(arr,idx+1);
        System.out.println(arr[idx]+" ");
    }
    public static boolean exist(int arr[],int target,int idx){
        if(idx==arr.length) return false;
        if(target==arr[idx]) return true;
        return exist(arr,target,idx+1);
    }
}
