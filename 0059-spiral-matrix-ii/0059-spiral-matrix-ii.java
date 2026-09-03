class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int toprow = 0;
        int bottomrow = n-1;
        int leftcolumn = 0;
        int rightcolumn = n-1;

        int current = 1;

        while(current<=n*n){
            // toprow = leftcolumn to right column; ( row is fixed and column is varible)
             for(int j = leftcolumn; j<=rightcolumn && current<=n*n ;j++){
                matrix[toprow][j]=current++;
             }
             toprow++;


             // right column = toprow to bottomrow; ( column is fixed and row is varible)
             for(int i =  toprow; i<= bottomrow && current<=n*n; i++){
                matrix[i][rightcolumn]=current++;
             }
            rightcolumn--;

             // bottomrow = rightcolumn to left column; ( row is fixed and column is varible)
             for(int j = rightcolumn; j>=leftcolumn && current<=n*n;j--){
                matrix[bottomrow][j]=current++;
             }
             bottomrow--;


         // left column = bottomrow to toprow; ( column is fixed and row is varible)
             for(int i = bottomrow; i>= toprow && current<=n*n; i--){
                matrix[i][leftcolumn]=current++;
             }
            leftcolumn++;


        }
        return matrix;
        }
    }
