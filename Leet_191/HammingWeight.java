package Leet_191;

class Solution {
    // you need to treat n as an unsigned value
    int hammingWeight(int n) {
        int c = 0;
        String bs = Integer.toBinaryString(n);
        for(int i=0;i<bs.length();i++){
            if(bs.charAt(i)=='1')c++;
        }
        return c;
    }
}

public class HammingWeight {
    public static void main(String args[]) {
        Solution s = new Solution();
        int n = -3;
        int res = s.hammingWeight(n);
        System.out.println(res);
    }

}
