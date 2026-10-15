class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the array is increasing, peak is on the right
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } 
            else {
                // Peak is at mid or on the left
                end = mid;
            }
        }

        // start and end meet at the peak index
        return start;
    }
}



