class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // m is number of rows and n is number of  column
        int m = matrix.length;
        int n = matrix[0].length;

    
        int start =  0; 
        int end = m*n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int midElement = matrix[mid/n][mid%n];
            if(midElement == target){
                return true;
            }
            else if(midElement<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}