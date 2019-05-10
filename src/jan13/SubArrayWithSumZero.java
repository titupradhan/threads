package jan13;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {

    //O(n^2)
    static boolean findSubArrayWithSumZero(int[] array) {
        boolean found = false;

        for (int i = 0; i < array.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < array.length; j++) {
                sum = sum + array[j];
                if (sum == 0) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    //O(n)
    static boolean findSubArrayWithSumZero2(int[] array) {
        boolean found = false;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] == 0 || set.contains(sum)) {
                found = true;
                break;
            }
        }
        return found;
    }


    public static void main(String[] args) {
        int[] array = {7, 1, 2, 3, -2, 1, -4, 7, 3, 4, 1};
                    // 7  8  10 13 11  12   8 15  18 22 23   sum set

        System.out.println(findSubArrayWithSumZero(array));
    }
}
