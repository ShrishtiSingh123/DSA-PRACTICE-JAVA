package BinarySearch;

public class Sorted {
    public int[] SortedSearch (int nums[],int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
    int search(int[] nums,int target,boolean StartIndex){
        int ans=-1;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else {
                ans=mid;

                if(StartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;

    }
}