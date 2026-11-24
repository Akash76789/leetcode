class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int low = 0; //  buying day 
        int high = 0; // selling day 
        int maxProfit = Integer.MIN_VALUE;
        while(high<n){
            int Profit = prices[high] - prices[low];
            maxProfit = Math.max(maxProfit,Profit);
            if(prices[low]>prices[high]){
                low = high;
            }
            high++;
        }
        if(maxProfit == Integer.MIN_VALUE){
            return 0;
        }
        return maxProfit;
    }
}