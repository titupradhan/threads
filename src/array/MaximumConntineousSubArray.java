package array;

public class MaximumConntineousSubArray {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //System.out.println(maxSum(array));
        System.out.println(kadane(array));
    }

    static int maxSum(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array can't be null or empty");

        int maxSum = array[0], currSum = array[0];
        for (int i = 1; i < array.length; i++) {
            currSum = Math.max(currSum + array[i], array[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }

    static int kadane(int[] array) {
        int maxSum = 0, currSum = 0, start = 0, end = 0;

        for (int i = 0; i < array.length; i++) {
            currSum = currSum + array[i];
            if (currSum <= 0) {
                currSum = 0;
                start = i+1;
            }
            if (maxSum < currSum) {
                maxSum = currSum;
                end = i;
            }
        }
        while (start <= end) {
            System.out.print(array[start++] + ",");
        }
        System.out.println();
        return maxSum;
    }
}
