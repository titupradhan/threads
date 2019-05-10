package dp;

public class MinimumSubsetSum {

    public static int canPartition(int[] num) {
        return canPartitionRecursive(num, 0, 0, 0);
    }

    private static int canPartitionRecursive(int[] num, int currentIndex, int sum1, int sum2) {
        if (currentIndex == num.length)
            return Math.abs(sum1 - sum2);

        int diff1 = canPartitionRecursive(num, currentIndex + 1, sum1 + num[currentIndex], sum2);

        int diff2 = canPartitionRecursive(num, currentIndex + 1, sum1, sum2 + num[currentIndex]);

        return Math.min(diff1, diff2);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 9};
        System.out.println(canPartition(num));
    }

}
