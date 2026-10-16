class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // Initialize the search range
        int start = 0;
        int end = n - 1;

        // Continue until both pointers meet
        while (start < end) {

            // Find the middle index
            int mid = start + (end - start) / 2;

            // If the slope is increasing, the peak is at right side .  search the right side
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }

            // Otherwise, if the slope is decreasing the peak is at mid or on the left side 
            else {
                end = mid;
            }
        }

        // start and end meet at the peak index
        return start;
    }
}
