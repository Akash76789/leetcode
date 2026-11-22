class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = k-1;
        double average = 0;
        double sum = 0;

        double maxavg = -Double.MAX_VALUE;

        for(int i = low; i <=high; i++){
            sum = sum + nums[i];
        }

        while(high<n){

            double length = high - low +1;
            
           
            if(length == k){
            average = sum/length ;
            maxavg = Math.max(average,maxavg);
            }
            low++;
            high++;
            if(high==n){
                break;
            }
            sum = sum - nums[low-1];
            sum = sum + nums[high];
            }

        return maxavg;

    }
}