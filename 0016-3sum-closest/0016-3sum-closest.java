class Solution {
    public int threeSumClosest(int[] nums, int target) {
      int n = nums.length;
      Arrays.sort(nums);

       int minimum = Integer.MAX_VALUE;
       int finalsum = 0;
      for(int i =0; i<n-2; i++){
        int j = i+1;
        int k = n-1;
        

        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            int difference = Math.abs(sum-target);
            
          
            if(sum==target){
                finalsum = sum;
                return finalsum;
            }
            else if(sum<target){
                if(minimum>difference){
                    minimum = difference;
                    finalsum = sum;
                }
                j++;
            }
            else{
                if(minimum>difference){
                    minimum = difference;
                    finalsum = sum;
                }
                k--;
            }
            
        }
      }
      return finalsum;
    }
}