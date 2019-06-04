package dp;

//you can only move 1 step,2 step ,3 step
public class NoOfWaysReachEndOfStaireCase {

    static int count = 0;

    public static void main(String[] args) {
        noOfWays(5, 0);
        System.out.println(count);

        System.out.println(noOfWays(5));

        System.out.println(noOfWaysDP(5));
    }

    static void noOfWays(int n, int curr) {
        if (n == 0) {
            return;
        }
        if (curr == n) {
            count++;
        }
        int i = 1;
        while (i <= 3) {
            if (curr + i <= n) {
                noOfWays(n, curr + i);
            }
            i++;
        }
    }

    static int noOfWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return noOfWays(n - 1) + noOfWays(n - 2) + noOfWays(n - 3);
        }

    }

    static int noOfWaysDP(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

}
