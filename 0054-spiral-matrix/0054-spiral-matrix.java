class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // Four boundaries
        int toprow = 0;
        int bottomrow = r - 1;
        int leftcolumn = 0;
        int rightcolumn = c - 1;

        // Store spiral elements
        List<Integer> ans = new ArrayList<>();

        int totalelement = 0;

        // Continue until all elements are added
        while (totalelement < r * c) {

            // 1. TOP ROW
            // Row is fixed, column changes
            // Left → Right
            for (int j = leftcolumn;
                 j <= rightcolumn && totalelement < r * c;
                 j++) {

                ans.add(matrix[toprow][j]);
                totalelement++;
            }

            // Top row completed
            toprow++;


            // 2. RIGHT COLUMN
            // Column is fixed, row changes
            // Top → Bottom
            for (int i = toprow;
                 i <= bottomrow && totalelement < r * c;
                 i++) {

                ans.add(matrix[i][rightcolumn]);
                totalelement++;
            }

            // Right column completed
            rightcolumn--;


            // 3. BOTTOM ROW
            // Row is fixed, column changes
            // Right → Left
            for (int j = rightcolumn;
                 j >= leftcolumn && totalelement < r * c;
                 j--) {

                ans.add(matrix[bottomrow][j]);
                totalelement++;
            }

            // Bottom row completed
            bottomrow--;


            // 4. LEFT COLUMN
            // Column is fixed, row changes
            // Bottom → Top
            for (int i = bottomrow;
                 i >= toprow && totalelement < r * c;
                 i--) {

                ans.add(matrix[i][leftcolumn]);
                totalelement++;
            }

            // Left column completed
            leftcolumn++;
        }

        return ans;
    }
}