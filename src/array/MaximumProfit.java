package array;

import static java.lang.Math.*;

public class MaximumProfit {
    public static void main(String[] args) {
        int[] array = {10, 18, 26, 31, 4, 53, 69};
        System.out.println(maxProfitByBuyAndSellOnce(array));
        System.out.println(maxProfitByBuyAndSellMultipleTimes(array));
    }

    //maximum difference between two element
    private static int maxProfitByBuyAndSellOnce(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int buy = array[0], profit = 0;
        for (int i = 1; i < array.length; i++) {
            if (buy >= array[i]) {
                buy = array[i];
            } else {
                profit = max(profit, array[i] - buy);
            }
        }
        return profit;
    }

    private static int maxProfitByBuyAndSellMultipleTimes(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int buy = array[0], profit = 0, totalProfit = 0;
        for (int i = 1; i < array.length; i++) {
            if (buy >= array[i]) {
                buy = array[i];
                totalProfit += profit;
                profit = 0;
            } else {
                profit = max(profit, array[i] - buy);
            }
        }
        return totalProfit+profit;
    }
}
