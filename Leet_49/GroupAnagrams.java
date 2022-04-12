package Leet_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else{
                map.put(str, new ArrayList<>());
                map.get(str).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}

public class GroupAnagrams {
    public static void main(String args[]){
        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Solution s = new Solution();
        List<List<String>> res = s.groupAnagrams(strs);
        System.out.println(res.toString());
    }

}
