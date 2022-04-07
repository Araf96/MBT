package Task_2;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] P, int[] S) {
        // write your code in Java SE 8
        Arrays.sort(S);
        int carCount =0, inCar = 0; 
        int totalFriend = Arrays.stream(P).sum();
        for(int i=S.length-1;i>=0;i--){
            if(S[i] + inCar > totalFriend){
                carCount++;
                return carCount;
            }else{
                inCar = inCar + S[i];
                carCount++;
            }
        }
        return 0;
    }
}

public class Task_2 {
    public static void main(String args[]) {
        int P[] = { 4, 4, 2, 4 };
        int K[] = { 5, 5, 2, 5 };
        Solution sol = new Solution();
        int res = sol.solution(P, K);
        System.out.println(res);
    }
}
