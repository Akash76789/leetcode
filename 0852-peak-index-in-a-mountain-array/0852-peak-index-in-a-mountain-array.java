
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check that mid + 1 is a valid index
            if (mid + 1 < n && arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                start = mid + 1;
            } else {
                // Peak is at mid or on the left
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}


