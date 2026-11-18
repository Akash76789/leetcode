class Solution {
    public int maxArea(int[] height) {

    int n = height.length;

    int i = 0;
    int j = n-1;
    int maxWater = Integer.MIN_VALUE;
    while(i<j){
        int minHeight = Math.min(height[i],height[j]);
int currentCapacity = (j-i)*minHeight;
        maxWater = Math.max(maxWater, currentCapacity);
        if(height[i]<=height[j]){
            i++;
        }
        else{
            j--;
        }
    }
    return  maxWater;
    }
}