package Toptal_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        //Arrays.sort(A);
        int max = A[0];
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(A[i]>max) max = A[i];
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }else{
                map.put(A[i], 1);
            }
        }

        if(max<0){
            return 1;
        }

        for(int i=1;i<=max;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }

        return max+1;
    }
}


class Test{
    public static void main(String args[]){
        int arr[] = {6};
        Solution s = new Solution();
        int res = s.solution(arr);
        System.out.println(res);
    }
}
