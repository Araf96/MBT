package Leet_819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        ArrayList <String> bn = new ArrayList<>(Arrays.asList(banned));

        for(int i=0;i<banned.length;i++){
            banned[i] = banned[i].toLowerCase();
        }
        String []parArray = paragraph.split("\\W+");

        HashMap <String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<parArray.length;i++){
            if(map.containsKey(parArray[i])){
                map.put(parArray[i], map.get(parArray[i]) + 1);
            }else{
                map.put(parArray[i], 1);
            }
        }

        String res = "";
        int max = -1;

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue().compareTo(max)>0 && !bn.contains(m.getKey())){
                max = m.getValue();
                res = m.getKey();
            }
        }

        return res;
    }
}

public class MostCommonWord {
    public static void main(String args[]){
        String paragraph = "a.";
        String banned[] = {};
        Solution sol =  new Solution();
        String res = sol.mostCommonWord(paragraph, banned);
        System.out.println(res);
    }

    
}
