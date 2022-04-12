package Leeet_53;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = sum > max ? sum : max;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}

public class MaximumSubarray {
    public static void main(String args[]) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Solution sol = new Solution();
        int res = sol.maxSubArray(nums);
        System.out.println(res);
    }
}
