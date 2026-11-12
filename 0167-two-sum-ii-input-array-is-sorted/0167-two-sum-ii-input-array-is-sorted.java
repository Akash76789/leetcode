class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        // Initialize two pointers
        int i = 0;
        int j = n - 1;

        // Traverse until both pointers meet
        while(i < j) {

            // Calculate sum of two elements
            int sum = numbers[i] + numbers[j];

            if(sum == target) {

                // Return 1-based indices
                return new int[]{i + 1, j + 1};
            }

            else if(sum < target) {

                // Increase sum by moving left pointer
                i++;
            }

            else {

                // Decrease sum by moving right pointer
                j--;
            }
        }

        // Return if no pair is found
        return new int[]{-1, -1};
    }
}