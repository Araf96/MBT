package Leet_11;

class Solution {
    public int maxArea(int[] height) {
        int mArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = height[i] < height[j] ? height[i] : height[j];
                int w = j - i;
                mArea = Math.max(mArea, h * w);
            }
        }

        return mArea;
    }
}

public class MostWater {
    public static void main(String args[]) {
        int height[] = { 1,1 };
        Solution s = new Solution();
        int res = s.maxArea(height);
        System.out.println(res);
    }
}
