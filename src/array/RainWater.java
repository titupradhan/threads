package array;

import java.util.Stack;

public class RainWater {

    public static void main(String[] args) {
        int[] array = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(maxRainWater(array));
        System.out.println(maxRainWaterByStack(array));
    }

    public static int maxRainWater(int[] array) {
        int water = 0;
        int start = 0;
        int end = array.length - 1;
        int maxStart = array[start];
        int maxEnd = array[end];

        while (start < end) {
            if (maxStart <= maxEnd) {
                start++;
                maxStart = Math.max(maxStart, array[start]);
                water = water + maxStart - array[start];
            } else {
                end--;
                maxEnd = Math.max(maxEnd, array[end]);
                water = water + maxEnd - array[end];
            }
        }
        return water;
    }

    public static int maxRainWaterByStack(int[] array) {
        int water = 0;
        int start = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.add(i);
        }
        int arrayMax = array[0];
        int stackMax = stack.pop();

        while (!stack.isEmpty() && start < array.length) {
            if (arrayMax <= stackMax) {
                start++;
                arrayMax = Math.max(arrayMax, array[start]);
                water += arrayMax - array[start];
            } else {
                Integer top = stack.pop();
                stackMax = Math.max(stackMax, top);
                water += stackMax - top;
            }
        }
        return water;
    }
}
