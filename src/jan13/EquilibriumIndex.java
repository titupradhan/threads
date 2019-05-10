package jan13;

public class EquilibriumIndex {


    static int find(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum - array[i];
            if (sum == leftSum) {
                return i;
            }
            leftSum = leftSum + 1;

        }
        return -1;
    }
}
