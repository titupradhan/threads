package jan13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllSubArrayWithSumZero {

    private static void insert(Map<Integer, List<Integer>> sumMap, int sum, int index) {
        if (sumMap.get(sum) == null) {
            List<Integer> list = new ArrayList<>();
            sumMap.put(sum, list);
        }
        sumMap.get(sum).add(index);
    }

    public static void printAllSubArray(int[] array) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        insert(sumMap, 0, -1); // if start is 0 or the subarray starts from zero
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            final List<Integer> list = sumMap.get(sum);
            if (list != null) {
                for (int k : list) {
                    System.out.println(k + 1 + "," + i);
                }
            }
            insert(sumMap, sum, i);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        printAllSubArray(array);
    }


}
