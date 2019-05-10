import com.google.common.base.Stopwatch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MaxProfit {

    static int maxProfit(int[] array) {
        if (array == null || array.length == 1) {
            return 0;
        }
        int maxProfit = 0, buy = array[0];

        for (int i = 1; i < array.length; i++) {
            int profit = array[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
            buy = Math.min(buy, array[i]);
        }
        return maxProfit;
    }

    public static long fibonacciNo(long n, Map<Long, Long> map) {
        if (map.get(n) != null) {
            return map.get(n);
        }
        long f = fibonacciNo(n - 1, map) + fibonacciNo(n - 2, map);
        map.put(n, f);
        return f;
    }

    public static void main(String[] args) {
        int[] array = {20, 30, 60, 30, 10, 50, 20, 60};
        //System.out.println(maxProfit(array));
        Map<Long, Long> map = new HashMap<>();
        map.put(1L, 1L);
        map.put(0L, 0L);
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(fibonacciNo(100, map));
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS) + " " + TimeUnit.MILLISECONDS);
    }
}
