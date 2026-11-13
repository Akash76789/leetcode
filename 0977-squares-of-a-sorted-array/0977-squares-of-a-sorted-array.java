
class Solution {

    // Method to reverse an array
    public static void reverse(int[] arr){

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public int[] sortedSquares(int[] nums) {

        int m = 0;
        int n = 0;

        // Count positive and negative elements
        for(int i = 0; i < nums.length; i++){

            if(nums[i] >= 0){
                m++;
            }
            else{
                n++;
            }
        }

        int[] positive = new int[m];
        int[] negative = new int[n];

        int p = 0;
        int q = 0;

        // Separate positive and negative elements
        for(int i = 0; i < nums.length; i++){

            if(nums[i] >= 0){
                positive[p] = nums[i];
                p++;
            }
            else{
                negative[q] = nums[i];
                q++;
            }
        }

        // Square positive elements
        for(int i = 0; i < m; i++){
            positive[i] = positive[i] * positive[i];
        }

        // Square negative elements
        for(int i = 0; i < n; i++){
            negative[i] = negative[i] * negative[i];
        }

        // Reverse negative array
        reverse(negative);

        // Create result array
        int[] result = new int[m + n];

        int i = 0; // Positive pointer
        int j = 0; // Negative pointer
        int k = 0; // Result pointer

        // Merge both sorted arrays
        while(i < m && j < n){

            if(positive[i] <= negative[j]){
                result[k] = positive[i];
                i++;
                k++;
            }
            else{
                result[k] = negative[j];
                j++;
                k++;
            }
        }

        // Copy remaining positive elements
        while(i < m){
            result[k] = positive[i];
            i++;
            k++;
        }

        // Copy remaining negative elements
        while(j < n){
            result[k] = negative[j];
            j++;
            k++;
        }

        return result;
    }
}
