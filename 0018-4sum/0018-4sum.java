class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        int k = arr.length;
        // for every value of i and j two pointer will be aplied covering all the quadtriplest 

    //    int i = 0; // fix 
    //    int j = i+1; // fix 
    //    int m = j+1; // apply two  pointer
    //    int n = n-1; // apply two pointer

       for(int i =0; i<k-3; i++){
        if(i>0 && arr[i]==arr[i-1]){
            continue; // skips this iteration
        }
        for(int j = i+1; j<k-2; j++){
            if(j>i+1 && arr[j]==arr[j-1]){
                continue; // skips this iteration 
            }
            int m = j+1; // apply two  pointer
            int n = k-1;
          while(m<n){
            long sum = (long) arr[i]+arr[j]+arr[m]+arr[n];
            if(sum==target){
                ans.add(Arrays.asList(arr[i],arr[j],arr[m],arr[n]));
                m++;
                n--;
            while(m<n && arr[m]==arr[m-1]){
                m++; // skip dupliactes 
            }
            while(m<n && arr[n]==arr[n+1]){
                n--; // skip dupliactes 
            }
          }
          else if(sum<target){
            m++;
          }
          else{
            n--;
          }

       }
        }
          
    
    }
    return ans;
}
}