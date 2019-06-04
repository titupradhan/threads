package matrix;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        print(matrix);
    }

    static void print(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int i;
        int currRow = 0;
        int currCol = 0;

        while (currRow < row && currCol < col) {

            for (i = 0; i < row; i++) {
                System.out.print(matrix[currRow][i] + "\t");
            }
            currRow++;

            for (i = currRow; i < col; i++) {
                System.out.print(matrix[i][col - 1] + "\t");
            }
            col--;

            if (currRow < row) {
                for (i = col - 1; i >= currCol; i--) {
                    System.out.print(matrix[row-1][i] + "\t");
                }
                row--;
            }

            if (currCol < col) {
                for (i = row - 1; i >= currRow; i--) {
                    System.out.print(matrix[i][currCol]+"\t");
                }
                currCol++;
            }
        }
    }
}
