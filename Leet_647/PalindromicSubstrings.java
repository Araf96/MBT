package Leet_647;

class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (r < s.length() - 1 && s.charAt(i) == s.charAt(r + 1)) {
                r++;
            }

            while (l > 0 && r < s.length() - 1) {
                if (s.charAt(l - 1) == s.charAt(r + 1)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            if (end - start + 1 < r - l + 1) {
                start = l;
                end = r;
            }
        }
        return s.substring(start, end + 1);
    }
}

public class PalindromicSubstrings {
    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "ac";
        String res = sol.longestPalindrome(s);
        System.out.println(res);
    }
}
