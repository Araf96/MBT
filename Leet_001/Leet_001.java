package Leet_001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable <Integer, Integer> table = new Hashtable();

        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(nums[i])) {
                int idx = (int) table.get(nums[i]);
                return new int[] { i, idx };
            } else {
                int diff = target - nums[i];
                table.put(diff, i);
            }
        }

        return new int[] {};
    }
}

class Leet_001 {
    public static void main(String agrs[]) {
        int nums[] = { 3, 2, 4 };
        int target = 6;
        Solution s = new Solution();
        int[] res = s.twoSum(nums, target);
        System.out.println(res[0] + ", " + res[1]);
    }
}
