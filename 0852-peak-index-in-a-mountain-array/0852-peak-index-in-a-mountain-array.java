
class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        // Binary search for the peak
        while (start < end) {

            int mid = start + (end - start) / 2;

            // Array is increasing, so peak is on the right
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            // Array is decreasing or mid is the peak
            else {
                end = mid;
            }
        }

        // start and end meet at the peak index
        return start;
    }
}