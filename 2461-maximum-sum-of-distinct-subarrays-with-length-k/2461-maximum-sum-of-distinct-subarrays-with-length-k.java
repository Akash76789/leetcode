
import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        // HashMap stores element and its frequency
        HashMap<Integer, Integer> f = new HashMap<>();

        int n = nums.length;

        // If array size is smaller than window size
        if (n < k) return 0;

        int low = 0;       // Starting index of window
        int high = k - 1;  // Ending index of window

        long sum = 0;
        long maxSum = 0;

        // Calculate sum and frequency of first window
        for (int i = low; i <= high; i++) {

            sum = sum + nums[i];

            // Increase frequency of current element
            f.put(nums[i], f.getOrDefault(nums[i], 0) + 1);
        }

        // Move the window until the array ends
        while (high < n) {

            // Check whether all k elements are distinct
            if (f.size() == k) {

                // Update maximum sum
                maxSum = Math.max(maxSum, sum);
            }

            // Move window one position forward
            low++;
            high++;

            // Stop if window reaches the end
            if (high >= n) {
                break;
            }

            // Remove outgoing element from sum
            sum = sum - nums[low - 1];

            // Decrease frequency of outgoing element
            f.put(nums[low - 1], f.get(nums[low - 1]) - 1);

            // Remove key if its frequency becomes zero
            if (f.get(nums[low - 1]) == 0) {
                f.remove(nums[low - 1]);
            }

            // Add incoming element to sum
            sum = sum + nums[high];

            // Increase frequency of incoming element
            f.put(nums[high], f.getOrDefault(nums[high], 0) + 1);
        }

        // Return maximum sum of valid windows
        return maxSum;
    }
}
