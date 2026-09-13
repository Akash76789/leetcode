class Solution {
    public static void reverse(int [] arr){
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void transpose (int [][] mat){
        int n = mat.length;
     for(int i =0; i<n; i++){
         for(int j =i; j<n; j++){
             int temp = mat[i][j];
             mat[i][j]= mat[j][i];
             mat[j][i]= temp;
         }
     }
    }
    public void rotate(int[][] mat) {
      
      transpose(mat);
      
     for(int i =0; i<mat.length;i++){
         reverse(mat[i]);
     }
        
    }
}