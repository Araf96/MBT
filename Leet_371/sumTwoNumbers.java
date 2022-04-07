package Leet_371;

class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            carry = carry << 1;
            int sum = a ^ b;
            a = sum;
            b = carry;
        }

        return a;
    }
}

public class sumTwoNumbers {
    public static void main(String args[]) {
        int a = -2;
        int b = 6;
        Solution sol = new Solution();
        int res = sol.getSum(a, b);
        System.out.println(res);
    }
}
