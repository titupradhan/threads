package jan13;

import java.util.Arrays;

public class SortBinaryArray {

    public static void sort(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            if (array[start] == 0) {
                start++;
            } else if (array[end] == 1) {
                end--;
            } else {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{0, 0, 1, 1};
        sort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{0, 0, 1, 0, 1, 1};
        sort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 1, 1, 1, 0};
        sort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 1, 1, 1, 1, 1};
        sort(array);
        System.out.println(Arrays.toString(array));

    }
}
