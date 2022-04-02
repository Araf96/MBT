package Leet_001;

import java.util.Arrays;

class Solution {
    int findIndex(int []nums, int val, int idx){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val && i!=idx){
                return i;
            }
        }
        return -1;
    };

    public int[] twoSum(int[] nums, int target) {
        int sArr[] = nums.clone();

        Arrays.sort(sArr);

        int s=0, e=nums.length-1;

        while(s<e){
            if(sArr[s]+sArr[e]==target){
                return new int[]{findIndex(nums, sArr[s], s),findIndex(nums, sArr[e], e)};
            }else if(sArr[s]+sArr[e]<target){
                s++;
            }else{
                e--;
            }
        }

        return new int[] {};
    }
}

class Leet_001 {
    public static void main(String agrs[]){
        int nums[] = {3,2,4};
        int target = 6;
        Solution s = new Solution();
        int []res = s.twoSum(nums, target);
        System.out.println(res[0] + ", " + res[1]);
    }
}
