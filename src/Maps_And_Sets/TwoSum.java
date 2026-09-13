package Maps_And_Sets;
import java.util.*;
public class TwoSum {
    boolean twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int rem=target-nums[i];
            if(set.contains(rem)) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
