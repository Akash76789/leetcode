class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Store all unique triplets
        List<List<Integer>> ans = new ArrayList<>();

        // Step 2: Fix the first element
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Initialize two pointers
            int j = i + 1;
            int k = n - 1;

            // Search for two elements whose sum is -nums[i]
            while (j < k) {

                // Calculate the sum of three elements
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    // Store the valid triplet
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Move both pointers
                    j++;
                    k--;

                    // Skip duplicate second elements
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate third elements
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }

                // If sum is less than zero, increase j
                else if (sum < 0) {
                    j++;
                }

                // If sum is greater than zero, decrease k
                else {
                    k--;
                }
            }
        }

        // Return all unique triplets
        return ans;
    }

   
    }

