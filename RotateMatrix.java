// Rotate Matrix 90 Degrees In-Place


public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(mat);
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                swap(matrix, i, j, j, i);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n / 2; j++)
                swap(matrix, i, j, i, n - 1 - j);
    }

    private static void swap(int[][] m, int i1, int j1, int i2, int j2) {
        int temp = m[i1][j1];
        m[i1][j1] = m[i2][j2];
        m[i2][j2] = temp;
    }
}
