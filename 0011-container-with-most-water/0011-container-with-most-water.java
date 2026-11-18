class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0; 
        int j = n-1;
        int maxWater = 0;

        while(i<j){
            maxWater = Math.max(maxWater,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}