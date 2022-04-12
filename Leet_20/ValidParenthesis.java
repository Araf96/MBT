package Leet_20;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() < 1)
            return false;
        Stack<Character> stk = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stk.add(s.charAt(i));
            } else if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
                if(stk.isEmpty()){
                    return false;
                }
                Character ch = stk.pop();
                if (map.get(s.charAt(i)) == ch) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(stk.isEmpty())return true;
        else return false;
    }
}

public class ValidParenthesis {
    public static void main(String args[]) {
        String s = "(]";
        Solution sol = new Solution();
        boolean res = sol.isValid(s);
        System.out.println(res);
    }

}
