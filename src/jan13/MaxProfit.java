package jan13;

public class MaxProfit {

    static int maxProfitOnce(int[] stocks) {
        if (stocks == null || stocks.length < 3) {
            throw new IllegalArgumentException("stocks length should be more than 2");
        }
        int max = 0;
        int buy = stocks[0];
        for (int i = 1; i < stocks.length; i++) {
            int profit = stocks[i] - buy;
            max = Math.max(profit,max);
            if (profit < 0) {
                buy = stocks[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] stocks = {20, 30, 60, 10, 21, 11};
        System.out.println(maxProfitOnce(stocks));
    }
}
