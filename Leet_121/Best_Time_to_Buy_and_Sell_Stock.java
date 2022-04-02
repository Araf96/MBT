package Leet_121;

import javax.sound.sampled.SourceDataLine;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                max = Math.max(prices[j]-prices[i], max);
            }
        }
        return max;
    }
}

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        Solution sol = new Solution();
        int res = sol.maxProfit(prices);
        System.out.println(res);
    }
}
