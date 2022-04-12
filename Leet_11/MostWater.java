package Leet_11;

class Solution {
    public int maxArea(int[] height) {
        int mArea = 0;
        int l = 0, r = height.length - 1;
        while (r > l) {
            mArea = Math.max(mArea, Math.min(height[l], height[r]) * (r - l));
            if (height[r] > height[l])
                l++;
            else if (height[r] < height[l])
                r--;
            else {
                r--;
                l++;
            }
        }
        return mArea;
    }
}

public class MostWater {
    public static void main(String args[]) {
        int height[] = { 1, 1 };
        Solution s = new Solution();
        int res = s.maxArea(height);
        System.out.println(res);
    }
}
