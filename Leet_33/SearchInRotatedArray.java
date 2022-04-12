package Leet_33;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }

        while (r > l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if(nums[l] == target){
                return l;
            }
            else if(nums[r] == target){
                return r;
            }
            else if (nums[l] < nums[mid]) {
               if(target > nums[l] && target < nums[mid]){
                   r = mid;
               }else{
                   l = mid + 1;
               }
            }else{
                if(target >= nums[mid + 1] && target < nums[r]){
                    l = mid + 1;
                }else{
                    r = mid;
                }
            }
        }

        return -1;
    }
}

public class SearchInRotatedArray {
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,8,1,2,3};
        int target = 2;
        Solution sol = new Solution();
        int res = sol.search(arr, target);
        System.out.println(res);
    }
}
