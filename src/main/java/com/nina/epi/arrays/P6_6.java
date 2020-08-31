package com.nina.epi.arrays;

import java.util.List;

public class P6_6 {

    public static int maxProfit(List<Integer> prices) {
        int min = prices.get(0), profit = 0;
        for (int i = 1; i < prices.size(); i++) {
            int current = prices.get(i);
            if (current < min)
                min = current;
            else if (current > min && current - min > profit)
                profit = current - min;
        }
        return profit;
    }
}
