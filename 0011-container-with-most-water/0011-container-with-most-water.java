class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int i = 0;      // Points to the first line
        int j = n - 1;  // Points to the last line

        int maxWater = 0; // Stores the maximum water capacity

        while (i < j) {

            // Calculate water capacity using width and smaller height
            maxWater = Math.max(maxWater,
                    (j - i) * Math.min(height[i], height[j]));

            // Move the pointer pointing to the smaller height
            if (height[i] <= height[j]) {
                i++;
            } 
            else {
                j--;
            }
        }

        // Return the maximum water capacity
        return maxWater;
    }
}