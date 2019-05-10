package array;

public class OddOccurringNumber {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 3, 3, 3, 5, 5};
        System.out.println(find(array));
    }

    public static int find(int[] array) {
        int no = 0;
        for (int k : array) {
            no = no ^ k;
        }
        return no;
    }
}
