package MergeSort;

public class SortUsingMerge {
    public static void main(String[] args){
        int []arr={3,4,2,95,1,33,9,5,6,7};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n=arr.length;
//        S1) Create 2 empty array
        if(n==1) return;
        int[]a=new int[n/2];
        int[]b=new int[n-n/2];
//        S2) Copy paste arr in a & b
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx++];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx++];
        }
//        S3) Magic
        mergeSort(a);
        mergeSort(b);
//        S4)merge a & b into arr
        merge(a,b,arr);
    }

    public static void merge(int[]a,int[]b,int[]c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length ) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
            while(i<a.length){
                c[k++]=a[i++];
            }while(j<b.length){
                c[k++]=b[j++];
            }
        }
    }



