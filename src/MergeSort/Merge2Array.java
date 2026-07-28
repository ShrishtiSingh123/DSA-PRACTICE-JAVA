package MergeSort;

public class Merge2Array {
    public static void main(String[] args) {
    }
    public static void merge(int[]a,int[]b,int[]c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length ){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
            while(i<a.length){
                c[k++]=a[i++];
            }while(j<b.length){
                c[k++]=b[j++];
            }
        }
    }
}
