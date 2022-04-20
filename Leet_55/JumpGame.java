package Leet_55;

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int memo[] = new int[n];

        if(n==1){
            return true;
        }
        memo[0] = nums[0];
        for(int i=1;i<n;i++){  
            if(memo[i-1]<i) return false;
            memo[i] = Math.max(memo[i-1], i + nums[i]);
            if(memo[i]>=n-1) return true;
        }
        return false;
    }
}

public class JumpGame {
    public static void main(String args[]){
        int []nums = {2,1,0,0,1,4};
        Solution sol = new Solution();
        System.out.println(sol.canJump(nums));
    }
}
