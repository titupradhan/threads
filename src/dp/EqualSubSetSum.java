package dp;

/*

Given a set of positive numbers, find if we can partition it into two subsets such that the sum of elements in both
the subsets is equal.

Input: {1, 2, 3, 4}
Output: True
Input: {2, 3, 4, 6}
Output: False
 */
public class EqualSubSetSum {

    private static boolean subsetSum(int[] array) {

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        int currentIndex = 0;
        Boolean[][] mem = new Boolean[array.length][sum + 1];
        return subsetSumRecusive(array, sum, currentIndex, mem);
    }

    private static boolean subsetSumRecusive(int[] array, int sum, int currentIndex, Boolean[][] mem) {

        if (sum == 0) {
            return true;
        }
        if (array.length == 0 || currentIndex >= array.length) {
            return false;
        }
        if (mem[currentIndex][sum] != null) {
            if (sum >= array[currentIndex] && subsetSumRecusive(array, sum - array[currentIndex], currentIndex++, mem)) {
                return true;
            }
            mem[currentIndex][sum] = subsetSumRecusive(array, sum, currentIndex++, mem);
        }
        return mem[currentIndex][sum];
    }
}
