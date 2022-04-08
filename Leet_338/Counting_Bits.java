package Leet_338;

class Solution {
    int[] countBits(int n) {
        int resArr[] = new int[n + 1];
        for(int i=1;i<=n;i++){
            resArr[i] = resArr[i>>1] + (i & 1);
        }
        return resArr;
    }
}

public class Counting_Bits {
    public static void main(String args[]) {
        int n = 5;
        Solution sol = new Solution();
        int res[] = sol.countBits(n);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
