class Solution {

    public int[][] transpose(int[][] matrix) {

        // Number of rows in the original matrix
        int r = matrix.length;

        // Number of columns in the original matrix
        // matrix[0] means the first row
        // .length gives the number of elements in that row
        int c = matrix[0].length;

        // Original matrix: r × c
        // Transpose matrix: c × r
        int[][] ans = new int[c][r];

        // i represents the rows of the answer matrix
        // Since ans has c rows, i goes from 0 to c-1
        for (int i = 0; i < c; i++) {

            // j represents the columns of the answer matrix
            // Since ans has r columns, j goes from 0 to r-1
            for (int j = 0; j < r; j++) {

                // Swap row and column positions
                //
                // matrix[j][i] → original matrix
                // ans[i][j]   → transpose matrix
                ans[i][j] = matrix[j][i];
            }
        }

        // Return the transposed matrix
        return ans;
    }
}