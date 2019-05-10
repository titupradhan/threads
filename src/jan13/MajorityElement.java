package jan13;

public class MajorityElement {
    public static int majorityElement(int[] A) {
        int m = -1;

        int i = 0;

        for (int j = 0; j < A.length; j++) {
            if (i == 0) {
                m = A[j];
                i = 1;
            } else if (m == A[j]) {
                i++;
            } else {
                i--;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 2, 1, 2, 7, 4, 1, 2, 2, 3, 1, 2, 1, 8, 1, 1, 7, 5, 6, 1, 5};

        System.out.println("Majority element is " + majorityElement(arr));
    }
}
