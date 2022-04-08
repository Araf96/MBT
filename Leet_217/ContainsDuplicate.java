package Leet_217;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }

        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String args[]) {
        Solution s = new Solution();
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean res = s.containsDuplicate(nums);
        System.out.println(res);
    }
}
