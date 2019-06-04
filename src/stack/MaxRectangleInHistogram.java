package stack;

import java.util.Stack;

public class MaxRectangleInHistogram {


    public static void main(String[] args) {
        int[] array = {3,2};

        System.out.println(maxArea(array));
    }

    static int maxArea(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < array.length) {
            if (stack.isEmpty() || array[stack.peek()] <= array[i]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();

                maxArea = Math.max(maxArea, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }

        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxArea = Math.max(maxArea, array[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }
        return maxArea;

    }
}
