package Leet_003;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        if (s.length() == 0) {
            return maxLength;
        }

        String curr = "", result = "";

        for (int i = 0; i < s.length(); i++) {
            if (curr.indexOf(s.charAt(i)) != -1) {
                curr = curr.substring(curr.indexOf(s.charAt(i))+1);
            } 
            curr = curr + s.charAt(i);
            if (curr.length() > result.length()) {
                result = curr;
            }
        }

        return result.length();
    }
}

public class LongestSubstring {
    public static void main(String args[]) {
        String str = "dvdf";
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring(str));
    }
}
