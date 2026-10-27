class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
       HashMap<Integer,Integer>f = new HashMap<>();
       for(int i =0; i<n; i++){
        f.put(nums[i],f.getOrDefault(nums[i],0)+1);
    
       }

   int ans[] = new int[k];
   for(int i =0; i<k; i++){
    int mostfrequent= 0;
    int maxmimum = 0;
    for(int freq:f.values()){
        // This is incorrect because freq already holds one frequency from the loop. You don't need this assignment. freq = f.values;
    
        maxmimum = Math.max(maxmimum,freq);
    }

    for(int num:f.keySet()){
        if(f.get(num)==maxmimum){
          mostfrequent = num;
          break;
        }
    }
    ans[i] = mostfrequent;
    f.remove(mostfrequent);
   }
   return ans;

    }
}