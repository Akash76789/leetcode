class Solution {

    // Reverse one row
    public static void reverse(int[] matrix) {
        int n = matrix.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;

            i++;
            j--;
        }
    }

    // Transpose the matrix
    public static void transposematrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {

        // Step 1: Transpose
        transposematrix(matrix);

        int n = matrix.length;

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }
}