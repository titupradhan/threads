package jan13;

public class LargestSumContiguousArray {

    private static int kadaneAlgo(int[] array) {
        int sum = 0;
        int sumSoFar = 0;

        for (int i = 0; i < array.length; i++) {
            sumSoFar = sumSoFar + array[i];
            if (sum < sumSoFar) {
                sum = sumSoFar;
            }
            if (sumSoFar < 0) {
                sumSoFar = 0;
            }
        }
        return sum;
    }

    private static int kadaneAlgo2(int[] array) {
        int sum = 0, sumSoFar = 0;
        for (int i : array) {
            sumSoFar += i;
            sum = Math.max(sum, sumSoFar);
            sumSoFar = Math.max(sumSoFar, 0);
        }
        return sum;
    }

    private static int kadaneForAll(int[] array) {
        int sum = array[0];
        int sumSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            sumSoFar = Math.max(array[i], sumSoFar + array[i]);
            sum = Math.max(sum, sumSoFar);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(kadaneAlgo(array));
        System.out.println(kadaneAlgo2(array));
        System.out.println(kadaneForAll(array));
    }
}
