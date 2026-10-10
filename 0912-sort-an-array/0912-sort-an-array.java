
class Solution {

    // Merge two sorted halves of the array
    public static void merge(int[] nums, int l, int mid, int r) {

        int n1 = mid - l + 1; // Size of left half
        int n2 = r - mid;     // Size of right half

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy elements from the original array to left array
        for (int i = 0; i < n1; i++) {
            left[i] = nums[l + i];
        }

        // Copy elements from the original array to right array
        for (int i = 0; i < n2; i++) {
            right[i] = nums[mid + 1 + i];
        }

        int i = 0; // Index of left array
        int j = 0; // Index of right array
        int k = l; // Index of original array

        // Compare both arrays and insert smaller elements first
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < n1) {
            nums[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }

    // Divide the array into smaller parts and sort them
    public static void mergeSort(int[] nums, int l, int r) {

        // Base case: stop when one or zero elements remain
        if (l >= r) {
            return;
        }

        // Find the middle index
        int mid = l + (r - l) / 2;

        // Sort the left half
        mergeSort(nums, l, mid);

        // Sort the right half
        mergeSort(nums, mid + 1, r);

        // Merge the two sorted halves
        merge(nums, l, mid, r);
    }

    public int[] sortArray(int[] nums) {

        // Start sorting from the first to last index
        mergeSort(nums, 0, nums.length - 1);

        // Return the sorted array
        return nums;
    }
}
