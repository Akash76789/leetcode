class Solution {
    //   public static void reverse(int[]arr,int i,int j){
    //        while(i<j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //        } 
        // }
    public void rotate(int[] nums, int k) {
        //    int n = nums.length;
        //      k = k%n;
        //     reverse(nums,0,n-k-1);
        //     reverse(nums,n-k,n-1);
        //     reverse(nums,0,n-1);

      int n = nums.length;
      int[] arr = new int[n];
      int j = 0;
      k = k%n;

      for(int i =n-k; i<n; i++){
        arr[j] = nums[i];
        j++;
      }
      for(int i =0; i<n-k; i++){
        arr[j] = nums[i];
        j++;
      }
      
      for(int i = 0; i<n; i++){
        nums[i] = arr[i];
      }
      
    }
}
