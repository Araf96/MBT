package Leeet_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int sum = 0 - nums[i];
            int left = i + 1, right = nums.length - 1;
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }

                }
            }

        }
        return res;
    }
}

class ThreeSum {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        List res = sol.threeSum(nums);
        System.out.println(res.toString());
    }
}
