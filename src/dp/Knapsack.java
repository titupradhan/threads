package dp;

/*

Given the weights and profits of ‘N’ items, we are asked to put these items in a knapsack which has a capacity ‘C’. The goal is to get the maximum profit from the items in the knapsack. Each item can only be selected once, as we don’t have multiple quantities of any item.

Let’s take the example of Merry, who wants to carry some fruits in the knapsack to get maximum profit. Here are the weights and profits of the fruits:

Items: { Apple, Orange, Banana, Melon }
Weights: { 2, 3, 1, 4 }
Profits: { 4, 5, 3, 7 }
Knapsack capacity: 5
 */

public class Knapsack {


    private static int knapsack(int capacity, int[] weights, int[] values) {
        int currentIndex = 0;
        Integer[][] mem = new Integer[weights.length][capacity + 1];
        return knapsackRecursive(capacity, weights, values, currentIndex, mem);
    }

    private static int knapsackRecursive(int capacity, int[] weights, int[] values,
                                         int currentIndex, Integer[][] mem) {

        if (currentIndex >= weights.length) {
            return 0;
        }
        if (mem[currentIndex][capacity] != null) {
            return mem[currentIndex][capacity];
        }
        int value1 = 0;
        if (weights[currentIndex] <= capacity) {
            value1 = values[currentIndex] + knapsackRecursive(capacity - weights[currentIndex],
                    weights, values, currentIndex + 1, mem);
        }

        int value2 = knapsackRecursive(capacity, weights, values, currentIndex + 1, mem);
        mem[currentIndex][capacity] = Math.max(value1, value2);

        return mem[currentIndex][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 1, 4};
        int[] profits = {4, 5, 3, 7};
        int capacity = 5;

        System.out.println(knapsack(capacity, weights, profits));
    }
}
