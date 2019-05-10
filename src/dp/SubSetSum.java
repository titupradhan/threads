package dp;

/*

Given a set of positive numbers, determine if there exists a subset whose sum is equal to a given number ‘S’.

Example 1:
Input: {1, 2, 3, 7}, S=6
Output: True
The given set has a subset whose sum is '6': {1, 2, 3}
 */
public class SubSetSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7};
        System.out.println(subSetSum(array, 6));
    }

    private static boolean subSetSum(int[] array, int sum) {
        int currentIndex = 0;
        return subSetSumRecursive(array, sum, currentIndex);
    }

    private static boolean subSetSumRecursive(int[] array, int sum, int currentIndex) {

        if (sum == 0) {
            return true;
        }
        if (array.length == 0 || currentIndex >= array.length) {
            return false;
        }

        if (sum >= array[currentIndex] && subSetSumRecursive(array, sum - array[currentIndex], currentIndex + 1)) {
            return true;
        }

        return subSetSumRecursive(array, sum, currentIndex + 1);
    }

}
