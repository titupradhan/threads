package numbers;

public class MissingNumbers {


    public static void main(String[] args) {
        int[] array = {5, 6, 4, 1, 3};
        System.out.println(findMissing(array));
        System.out.println(findMissingByXOR(array));
        int[] array1 = {4, 3, 1, 2, 5};
        findMissingTwoNumbers(array1);


    }

    private static int findMissing(int[] array) {
        int n = array.length;
        int sum = ((n + 1) * (n + 2)) / 2;//formula (n*n+1)/2

        for (int i = 0; i < n; i++) {
            sum -= array[i];
        }
        return sum;

    }

    private static int findMissingByXOR(int[] array) {
        int totalXor = 0, arrayXor = 0;
        for (int i = 1; i < array.length + 2; i++) {
            totalXor = totalXor ^ i;
        }
        for (int i : array) {
            arrayXor = arrayXor ^ i;
        }
        return totalXor ^ arrayXor;
    }

    private static void findMissingTwoNumbers(int[] array) {
        int n = array.length + 2;

        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }
        int arraySum = 0;
        for (int i : array) {
            arraySum += i;
        }
        int pivot = (totalSum - arraySum) / 2;
        int leftTotalXor = 0;
        for (int i = 1; i <= pivot; i++) {
            leftTotalXor = leftTotalXor ^ i;
        }
        int rightTotalXor = 0;
        for (int i = pivot + 1; i <= n; i++) {
            rightTotalXor = rightTotalXor ^ i;
        }
        int leftArraryXor = 0, rightArrayXor = 0;
        for (int i : array) {
            if (i <= pivot) {
                leftArraryXor = leftArraryXor ^ i;
            } else {
                rightArrayXor = rightArrayXor ^ i;
            }
        }
        System.out.println("Missing numbers are  " + (leftTotalXor ^ leftArraryXor) + " : " + (rightTotalXor ^ rightArrayXor));
    }
}
