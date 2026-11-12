class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>f = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            f.put(nums[i],i);
        }

   for(int i = 0; i<nums.length;i++){
       int required = target - nums[i];
       if(f.containsKey(required)){
        if(f.get(required) != i){
            return new int[]{i,f.get(required)};
        }
       }
   }

   return new int[]{-1,-1};
 
    }
}