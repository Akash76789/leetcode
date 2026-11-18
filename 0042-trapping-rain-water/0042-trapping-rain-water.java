class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;

        // area = width(1) * height;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;

        while(i<j){
            leftmax = Math.max(leftmax,height[i]);
            rightmax = Math.max(rightmax,height[j]);

            if(leftmax<=rightmax){
                ans = ans+ (leftmax-height[i]);
                i++;
            }
            else{
                ans+= (rightmax-height[j]);
                j--;
            }
        }
        return ans;
    }
}