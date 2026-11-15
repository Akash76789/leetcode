
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        // Sort the array to apply the two-pointer approach
        Arrays.sort(nums);

        int minimum = Integer.MAX_VALUE;
        int finalsum = 0;

        // Fix one element and find the other two elements
        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;  // Pointer for the second element
            int k = n - 1;  // Pointer for the third element

            // Search for the closest sum using two pointers
            while (j < k) {

                // Calculate the sum of three current elements
                int sum = nums[i] + nums[j] + nums[k];

                // Calculate the absolute difference from target
                int difference = Math.abs(sum - target);

                // If exact target is found, return immediately
                if (sum == target) {
                    return sum;
                }

                // Update the closest sum if a smaller difference is found
                if (minimum > difference) {
                    minimum = difference;
                    finalsum = sum;
                }

                // If sum is smaller than target, increase the sum
                if (sum < target) {
                    j++;
                }

                // If sum is greater than target, decrease the sum
                else {
                    k--;
                }
            }
        }

        // Return the closest sum found
        return finalsum;
    }
}
