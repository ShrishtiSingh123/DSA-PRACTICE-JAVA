package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {

        int nums[]={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] nums){
        nums[0]=99;
    }
}