class Solution {

    public boolean searchMatrix(int[][] arr, int target) {

        int m = arr.length;       // Number of rows
        int n = arr[0].length;    // Number of columns

        int i = 0;                // Start from the first row
        int j = n - 1;             // Start from the last column

        // Continue while the row and column indices are valid
        while (i < m && j >= 0) {

            // Check if the current element is the target
            if (arr[i][j] == target) {
                return true;
            }

            // If the current element is smaller, move down
            else if (arr[i][j] < target) {
                i++;
            }

            // If the current element is larger, move left
            else {
                j--;
            }
        }

        // Target was not found in the matrix
        return false;
    }
}