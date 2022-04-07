package Task_1;

class Solution {
    public String solution(String message, int K) {
        // write your code in Java SE 8
        String[] splited = message.split("\\s+");
        String res = "";
        for (int i = 0; i < splited.length; i++) {
            String temp = res.length() == 0 ? splited[i] : res + " " + splited[i];
            res = temp.length() <= K ? temp : res;
        }

        return res;
    }
}

public class Task_1 {
    public static void main(String args[]) {
        String m = "Codility We test coders";
        int k = 14;

        Solution sol = new Solution();
        String res = sol.solution(m, k);
        System.out.println(res);
    }
}
