package array;

import java.util.Arrays;

public class RemoveDuplicate {

    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];

        arr[j++] = arr[n - 1];

        return j;
    }

    public int[] removeDuplicate(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        int i = 0, j = 1, n = array.length;

        while (j < n) {
            while (j < n && array[i] == array[j]) {
                j++;
            }
            if (j < n) {
                swap(++i, j++, array);
            }
        }
        boolean haveDuplicate = i != n - 1;
        if (haveDuplicate) {
            /*int[] array1 = new int[i + 1];
            for (int k = 0; k < array1.length; k++) {
                array1[k] = array[k];
            }
            array = array1;*/
            array = Arrays.copyOf(array, i + 1);
        }
        return array;

    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3};
        RemoveDuplicate rd = new RemoveDuplicate();
        final int[] n = rd.removeDuplicate(array);

        System.out.println(Arrays.toString(n));


    }
}
