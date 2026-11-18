class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid =0;
        while(mid<=high){
            if(nums[mid]==2){
                // swaps nums[mid] && nums[high]
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else if(nums[mid]==0){
          // swaps nums[mid] && nums[low]
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else{
                mid++;
            }
            }
        }
    }
