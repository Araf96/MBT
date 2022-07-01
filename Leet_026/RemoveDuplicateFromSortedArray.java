package Leet_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashMap <Integer, Integer> hm = new LinkedHashMap<Integer, Integer>(); 

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        int i=0;
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()){
            nums[i] = entry.getKey();
            System.out.println(entry.getKey());
            i++;
        }

        return hm.size();
    }
}

public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]) {
        int arr[] = {-3,-1,0,0,0,3,3};
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(arr));
    }
}
