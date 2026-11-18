class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int i = 0;      // Points to the current position from the left
        int j = n - 1;  // Points to the current position from the right

        int leftmax = 0;  // Stores maximum height encountered from the left
        int rightmax = 0; // Stores maximum height encountered from the right

        int ans = 0; // Stores the total trapped water

        while (i < j) {

            // Update the maximum height encountered from the left
            leftmax = Math.max(leftmax, height[i]);

            // Update the maximum height encountered from the right
            rightmax = Math.max(rightmax, height[j]);

            // If the left maximum is smaller or equal,
            // we can safely calculate water at the left position
            if (leftmax <= rightmax) {

                // Water trapped = left maximum - current height
                ans += (leftmax - height[i]);

                // Move the left pointer to the next position
                i++;
            }
            else {

                // Water trapped = right maximum - current height
                ans += (rightmax - height[j]);

                // Move the right pointer to the previous position
                j--;
            }
        }

        // Return the total trapped water
        return ans;
    }
}