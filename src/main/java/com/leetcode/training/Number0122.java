package com.leetcode.training;

public class Number0122 {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int amount = prices[i + 1] - prices[i];
            if (amount > 0) {
                maxProfit += amount;
            }
        }
        return maxProfit;
    }

}
