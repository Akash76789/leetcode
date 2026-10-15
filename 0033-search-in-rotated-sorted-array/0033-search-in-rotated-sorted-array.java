class Solution {
    public static int  binarysearch(int [] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
           if(nums[mid]== target){
            return mid;
        }
        else if(nums[mid]<nums[end]){ // right half mid to end is sorted
            if(nums[mid]<target && target<= nums[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        else{  //(arr[start]<arr[mid]) / start to end is sorted/
            if(nums[start]<=target && nums[mid]>target){
               end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        }
        return -1;
        
    }
    public int search(int[] nums, int target) {
        return binarysearch(nums,target);
    }
}