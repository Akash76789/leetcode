
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (high < n) {

            sum = sum + nums[high]; // Add current element to window

            // Shrink the window while sum is greater than or equal to target
            while (sum >= target) {

                int length = high - low + 1; // Calculate window length

                // Update minimum subarray length
                minLength = Math.min(minLength, length);

                sum = sum - nums[low]; // Remove leftmost element
                low++; // Move left pointer forward
            }

            high++; // Expand window by moving right pointer
        }

        // If no valid subarray is found, return 0
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }
}
