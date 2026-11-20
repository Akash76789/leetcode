
import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> f = new HashMap<>();

        int n = nums.length;
        int low = 0;       // Starting pointer
        int high = k - 1;  // Ending pointer

        long sum = 0;
        long maxSum = 0;   // If no valid window exists, return 0

        // Calculate sum and frequency of first window
        for (int i = low; i <= high; i++) {

            sum = sum + nums[i];

            // Increase frequency of current element
            f.put(nums[i], f.getOrDefault(nums[i], 0) + 1);
        }

        while (high < n) {

            // Check whether all k elements are distinct
            if (f.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }

            // Move the window
            low++;
            high++;

            if (high < n) {

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
        }

        return maxSum;
    }
}
