
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Create a temporary array
        int result[] = new int[m + n];

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for result

        // Compare elements of both arrays
        while(i < m && j < n){

            if(nums1[i] <= nums2[j]){

                result[k] = nums1[i];
                i++;
                k++;
            }
            else{

                result[k] = nums2[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements of nums1
        while(i < m){

            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while(j < n){

            result[k] = nums2[j];
            j++;
            k++;
        }

        // Copy result back into nums1
        int q = 0;

        for(int p = 0; p < result.length; p++){

            nums1[q] = result[p];
            q++;
        }
    }
}
