class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> f = new HashMap<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }

  int [] ans = new int[k];

  for(int j =0; j<k; j++){
    int maxfreq = Integer.MIN_VALUE;
    int mostfrequent = 0;

    for(int num: f.keySet()){
       if(f.get(num)>maxfreq){
        maxfreq = f.get(num);
        mostfrequent = num;
       }
    }

    ans[j] = mostfrequent;
    f.remove(mostfrequent);

  }
  return ans;
    }
   
}