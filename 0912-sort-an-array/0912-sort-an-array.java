
class Solution {

    // Merge two sorted parts of the array
    public static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid - l + 1;  // Size of left part
        int n2 = r - mid;      // Size of right part

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy elements into the left array
        for (int i = 0; i < n1; i++) {
            left[i] = nums[l + i];
        }

        // Copy elements into the right array
        for (int i = 0; i < n2; i++) {
            right[i] = nums[mid + 1 + i];
        }

        int i = 0;  // Index of left array
        int j = 0;  // Index of right array
        int k = l;  // Index of original array

        // Compare elements and merge in ascending order
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        // Copy remaining elements from the left array
        while (i < n1) {
            nums[k++] = left[i++];
        }

        // Copy remaining elements from the right array
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }

    // Recursively divide and sort the array
    public static void mergesort(int[] nums, int l, int r) {

        // Base case: one or zero elements
        if (l >= r) {
            return;
        }

        // Find the middle index
        int mid = l + (r - l) / 2;

        // Sort the left half
        mergesort(nums, l, mid);

        // Sort the right half
        mergesort(nums, mid + 1, r);

        // Merge both sorted halves
        merge(nums, l, mid, r);
    }

    public int[] sortArray(int[] nums) {

        int l = 0;               // First index
        int r = nums.length - 1;  // Last index

        // Start Merge Sort
        mergesort(nums, l, r);

        return nums;  // Return the sorted array
    }
}
