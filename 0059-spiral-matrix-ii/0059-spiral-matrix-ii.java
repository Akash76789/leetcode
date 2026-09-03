class Solution {
    public int[][] generateMatrix(int n) {

        // Create an n x n matrix
        int[][] matrix = new int[n][n];

        // Four boundaries of the matrix
        int toprow = 0;
        int bottomrow = n - 1;
        int leftcolumn = 0;
        int rightcolumn = n - 1;

        // Number that we will put inside the matrix
        int current = 1;

        // Continue until current becomes greater than n*n
        while (current <= n * n) {

            // 1. TOP ROW
            // Row is fixed
            // Column is changing
            // Move: Left → Right
            for (int j = leftcolumn;
                 j <= rightcolumn && current <= n * n;
                 j++) {

                matrix[toprow][j] = current;
                current++;
            }

            // Top row is completed
            // Move top boundary down
            toprow++;


            // 2. RIGHT COLUMN
            // Column is fixed
            // Row is changing
            // Move: Top → Bottom
            for (int i = toprow;
                 i <= bottomrow && current <= n * n;
                 i++) {

                matrix[i][rightcolumn] = current;
                current++;
            }

            // Right column is completed
            // Move right boundary left
            rightcolumn--;


            // 3. BOTTOM ROW
            // Row is fixed
            // Column is changing
            // Move: Right → Left
            for (int j = rightcolumn;
                 j >= leftcolumn && current <= n * n;
                 j--) {

                matrix[bottomrow][j] = current;
                current++;
            }

            // Bottom row is completed
            // Move bottom boundary up
            bottomrow--;


            // 4. LEFT COLUMN
            // Column is fixed
            // Row is changing
            // Move: Bottom → Top
            for (int i = bottomrow;
                 i >= toprow && current <= n * n;
                 i--) {

                matrix[i][leftcolumn] = current;
                current++;
            }

            // Left column is completed
            // Move left boundary right
            leftcolumn++;
        }

        // Return the filled matrix
        return matrix;
    }
}
