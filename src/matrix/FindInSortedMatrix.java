package matrix;

public class FindInSortedMatrix {

    public static void find(int[][] matrix, int rows, int columns, int no) {
        int i = 0;
        int j = columns - 1;
        while (i < rows && j > columns) {
            if (matrix[i][j] == no) {
                System.out.println(no + "fount at [" + i + "," + j + "]");
                break;
            } else if (matrix[i][j] > no) {
                j--;
            } else {
                i++;
            }
        }
    }
}
