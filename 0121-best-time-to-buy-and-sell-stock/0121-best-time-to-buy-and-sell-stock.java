class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int low = 0; // buying day 
        int high = 0; // selling day 
        int maxProfit = Integer.MIN_VALUE;
        while(high<n){
           int  profit = nums[high]-nums[low];
            maxProfit = Math.max(profit,maxProfit);
            if(nums[low]>nums[high]){
                low = high;
            }
            high++;
        }
        return maxProfit;
    }
}