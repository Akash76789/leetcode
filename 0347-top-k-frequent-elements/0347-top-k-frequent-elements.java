class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n  = nums.length;

    HashMap<Integer,Integer> f = new HashMap<>();
    for(int i =0; i<n; i++){
        f.put(nums[i],f.getOrDefault(nums[i],0)+1);
    }

    int [] ans = new int[k];
    for(int j =0; j<k; j++){
        int maxmimumfrequency = 0;
        int mostfrequent = 0;
        for(int num : f.keySet()){
         if(f.get(num)> maxmimumfrequency){
             maxmimumfrequency = f.get(num);
             mostfrequent = num;
         }
        }
        ans[j] =  mostfrequent;
        f.remove( mostfrequent);
    }

   return ans;
    }
}