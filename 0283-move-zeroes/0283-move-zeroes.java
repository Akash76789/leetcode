class Solution {
    // bubble sort approach
    public void moveZeroes(int[] nums) {
       int n = nums.length;
     for(int i = 0; i<n-1; i++){
        boolean flag = false;
        for(int j =0; j<n-i-1; j++){
            if(nums[j]==0 && nums[j+1]!=0){ // swap them 
               int temp = nums[j];
               nums[j] = nums[j+1];
               nums[j+1]=temp;
               flag = true;
            }
        }
        if(flag==false){
            return;
        }
     }
    }
}