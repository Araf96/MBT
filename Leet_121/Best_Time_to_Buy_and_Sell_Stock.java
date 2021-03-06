package Leet_121;

import javax.sound.sampled.SourceDataLine;

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            max = Math.max(prices[i] - buy, max);

        }
        return max;
    }
}

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        Solution sol = new Solution();
        int res = sol.maxProfit(prices);
        System.out.println(res);
    }
}
