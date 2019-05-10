package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Map.Entry;

public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,6,3,1,6};
        print(array);

    }

    public static void print(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int index = array[i] % n;
            array[index] = array[index] + n;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            if ((array[i] / n) > 1)
                System.out.println(i + " ");
        }
    }

    static class Entry2<K,V>{

        K key;
        V value;

    }
}

