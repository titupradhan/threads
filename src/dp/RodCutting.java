package dp;

import java.util.HashMap;
import java.util.Map;

public class RodCutting {

    public static void main(String[] args) {
        //            {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        Map<Integer, Integer> mem = new HashMap<>();
        System.out.println(maxProfit(price, 4, mem));

        System.out.println("Hello");
    }

    static int maxProfit(int[] price, int n, Map<Integer, Integer> mem) {
        if (n == 0) return 0;
        int max = -1;
        for (int i = 1; i <= n; i++) {
            int profit = 0;
            profit = mem.get(n) == null ? price[i - 1] + maxProfit(price, n - i, mem) : mem.get(n);
            max = Math.max(max, profit);
        }
        mem.put(n, max);
        return max;
    }
}
