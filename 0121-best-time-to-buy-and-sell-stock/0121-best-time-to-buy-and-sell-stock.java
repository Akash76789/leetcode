
class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;

        int low = 0;  // Buying day
        int high = 0; // Selling day

        int maxProfit = 0; // Stores maximum profit

        while (high < n) {

            // Calculate profit by selling on the current day
            int profit = nums[high] - nums[low];

            // Update maximum profit
            maxProfit = Math.max(profit, maxProfit);

            // If current day's price is lower,
            // make it the new buying day
            if (nums[low] > nums[high]) {
                low = high;
            }

            // Move to the next selling day
            high++;
        }

        return maxProfit;
    }
}
