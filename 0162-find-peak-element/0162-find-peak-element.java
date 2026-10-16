
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the next element is greater, search the right side
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
            // Otherwise, the peak is at mid or on the left side
            else {
                end = mid;
            }
        }

        return start;
    }
}
