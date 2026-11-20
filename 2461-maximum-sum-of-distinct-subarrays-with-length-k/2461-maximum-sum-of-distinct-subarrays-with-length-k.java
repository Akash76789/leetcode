class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> f = new HashMap<>();
    int n = nums.length;
    int low =0; // start
    int high = k-1; // end 
    long sum = 0;
    long maxSum = 0;
    for(int i =low; i<=high;i++){
       sum = sum+ nums[i];
       f.put(nums[i],f.getOrDefault(nums[i],0)+1);
    }
    while(high<n){
        if(f.size()==k){
    maxSum = Math.max(maxSum,sum);
        }
    low++;
    high++;
    if(high<n){

    sum = sum - nums[low-1];
    f.put(nums[low-1], f.get(nums[low-1])-1);
    if(f.get(nums[low-1]) == 0){
        f.remove(nums[low-1]);
    }
    sum = sum + nums[high];
    f.put(nums[high],f.getOrDefault(nums[high],0)+1);
    }
    }
    return maxSum;
    }
}