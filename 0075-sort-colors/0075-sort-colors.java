class Solution {
    public void sortColors(int[] nums) {
     int n = nums.length;
       int left = 0; // points the next position where 0 should goes
       int right = n-1; // points th next position where 2 should goes 
       int mid = 0; // check current element
 
    while(mid<=right){
        if(nums[mid]==0){
            // swap nums[mid] && nums[low]
            int temp = nums[mid];
            nums[mid] = nums[left];
            nums[left]=temp;
            left++; 
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            // swap nums[mid] && nums[right]
            int temp = nums[mid];
            nums[mid] = nums[right] ;
            nums[right]= temp;

             right--;
        }
    }
      
    }
}