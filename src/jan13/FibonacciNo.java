package jan13;

import com.google.common.base.Stopwatch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FibonacciNo {

    static void printAll(int n) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }
    }

    static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    static int nthFibonacciDP(int n, Map<Integer, Integer> map) {

        if (map.get(n) != null) {
            return map.get(n);
        }
        int f = nthFibonacciDP(n - 1, map) + nthFibonacciDP(n - 2, map);
        map.put(n, f);
        return f;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(0,0);
        System.out.println(nthFibonacciDP(46,map));
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS) + " " + TimeUnit.MILLISECONDS);
    }
}
