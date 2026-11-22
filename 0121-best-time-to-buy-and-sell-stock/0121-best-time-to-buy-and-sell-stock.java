class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int low = 0; // Buying day
        int high = 0; // selling day 
        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;
        while(high<n){
          profit = nums[high]-nums[low];
          maxProfit = Math.max(profit,maxProfit);
            if(nums[high]<nums[low]){
             low = high;
            }
            high++;
        }
        return maxProfit;
        
    }
}