package Leet_338;

class Solution {
    int totalBits(int n){
        int c = 0;
        while(n!=0){
            n = n & (n-1);
            c++;
        }
        return c;
    }

    int[] countBits(int n) {
        int resArr[] = new int[n + 1];
        resArr[0] = 0;
        for(int i=1;i<=n;i++){
            resArr[i] = totalBits(i);
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
