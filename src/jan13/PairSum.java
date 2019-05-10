package jan13;

import java.util.Arrays;

public class PairSum {

    static  void print(int[] array, int sum) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        while (start != end) {
            int pairSum = array[start] + array[end];
            if (sum == pairSum) {
                System.out.println(array[start] + "," + array[end]);
                break; // when print all pairs start++ ,end--
            } else if (sum < pairSum) {
                end--;
            } else {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {14,6,7,4,3,5,9,8,95,5,6};
        print(array,10);
    }
}
