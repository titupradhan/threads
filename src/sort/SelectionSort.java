package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
        new SelectionSort().sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
