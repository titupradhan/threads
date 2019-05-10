package jan13;

public class RainHarvesting {

    public static void main(String[] args) {
        int[] arrays = {6, 5, 4, 7, 9, 6, 7, 6, 10, 11, 3, 2, 5};//, 3, 8, 9, 2}; //11+1+6=18


        System.out.println(maxRainFall(arrays));
    }

    static int maxRainFall(int[] array) {
        int p = 0;
        int sum = 0;

        int len = array.length;
        for (int i = 1; i < len; i++) {

            if (array[i] >= array[p] && i - p > 2) {
                int k = p + 1;
                int min = Math.min(array[p], array[i]);
                while (k < i) {
                    sum = sum + min - array[k];
                    k++;
                }
                p = i;
            }
            if (array[i] >= array[p]) {
                p = i;
            }
        }

        if (p < len - 2) {
            int maxIndex = len - 1;
            int start = p + 1;
            final int max = getMax(start, maxIndex, array);
            int min = Math.min(array[p], array[max]);

            int b = p + 1;
            while (b < max) {
                sum = sum + min - array[b];
                b++;
            }
        }
        return sum;
    }

    private static int getMax(int start, int maxIndex, int[] array) {
        int max = start;
        int i = start + 1;
        while (i <= maxIndex) {
            if (array[i] >= array[max]) {
                max = i;
            }
            i++;
        }
        return max;
    }
}
