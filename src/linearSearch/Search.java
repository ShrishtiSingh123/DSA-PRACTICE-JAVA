package linearSearch;

public class Search {
    public static void main(String[] args) {
        int[] nums = {1, 2, 45, 67, 87, 43, 23, 9};
        int target = 45;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
        static int linearSearch(int[]arr,int target) {
            if (arr.length == 0) {
                return -1;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

