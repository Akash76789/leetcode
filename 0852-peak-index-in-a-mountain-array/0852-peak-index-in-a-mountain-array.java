
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1; // Stores the peak index

        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the array is increasing, peak is on the right
            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1; // Store the possible peak index
                start = mid + 1; // Search the right half
            } 
            else {
                // Peak is at mid or on the left
                end = mid;
            }
        }

        return ans; // Return the stored peak index
    }
}



