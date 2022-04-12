package Leet_mock_test_p2;

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}

public class HammingWeight {
    public static void main(String args[]) {
        int n = 0;
        Solution s = new Solution();
        int count = s.hammingWeight(n);
        System.out.println(count);
    } 
}
