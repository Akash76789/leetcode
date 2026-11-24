class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
    int low = 0;
    int high = k-1;
    double sum = 0;
    double maxaverage = -Double.MAX_VALUE;

    for(int i =0; i<=high; i++){
        sum = sum + nums[i];
    }
    while(high<n){
        double average = (double) sum / k;
        maxaverage = Math.max(average,maxaverage);
        sum = sum - nums[low];
        low++;
        high++;
        if(high == n){
            break;
        }
        sum = sum + nums[high];
    }
    return maxaverage;
    }
}