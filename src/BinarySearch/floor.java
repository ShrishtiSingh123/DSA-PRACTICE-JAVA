package BinarySearch;

    public class floor {
        public static void main(String[] args) {
            int arr[]={2,4,6,8,9,14,18,19};
            int target=15;
            int ans=FloorSearch(arr,target);
            System.out.println(ans);

        }
        static int FloorSearch(int arr[],int target){
            int start=0,end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]>target){
                    end=mid-1;
                }else if (arr[mid]<target){
                    start=mid+1;
                }
            }
            return end;
        }
    }


