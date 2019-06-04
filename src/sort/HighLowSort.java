package sort;

import java.util.Arrays;

//Rearrange the array with alternate high and low elements
/*

Given an array of integers, rearrange the array such that every second element of the array is greater than its left and right elements.
 Assume no duplicate elements are present in the array.


 */
public class HighLowSort {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        if (array.length > 2) {
            Arrays.sort(array);
            for (int i = 1; i < array.length - 1; i += 2) {
                swap(array, i, i + 1);
            }
        }
    }

    private static void swap(int[] array, int i, int i1) {
        int temp = array[i];
        array[i] = array[i1];
        array[i1] = temp;
    }


}
