package Leet_647;

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1, r = i + 1;
            String temp = "" + s.charAt(i);
            while (r < s.length() && s.charAt(i) == s.charAt(r)) {
                temp += s.charAt(r);
                r++;
            }

            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    temp = s.charAt(l) + temp + s.charAt(r);                   
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            res = res.length() < temp.length() ? temp : res;
        }
        return res;
    }
}

public class PalindromicSubstrings {
    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "a";
        String res = sol.longestPalindrome(s);
        System.out.println(res);
    }
}
