
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        int low = 0;
        int high = k - 1;

        double average = 0;
        double sum = 0;

        double maxavg = -Double.MAX_VALUE;

        // Calculate sum of first window
        for (int i = low; i <= high; i++) {
            sum = sum + nums[i];
        }

        while (high < n) {

            // Calculate current window length
            double length = high - low + 1;

            // Calculate average when window size is k
            if (length == k) {
                average = sum / k;

                maxavg = Math.max(average, maxavg);
            }

            // Move window forward
            low++;
            high++;

            // Stop if high reaches the end
            if (high == n) {
                break;
            }

            // Remove outgoing element
            sum = sum - nums[low - 1];

            // Add incoming element
            sum = sum + nums[high];
        }

        return maxavg;
    }
}
