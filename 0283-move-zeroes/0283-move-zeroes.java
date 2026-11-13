class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
     int i = 0;
     int j = i+1;
     while(j<n){
        if(nums[i]==0 && nums[j]==0){
            j++;
        }
        else if(nums[i]==0 && nums[j]!=0){
            // swap thyem 
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j++;
        }
        else{
            i++;
            j++;
        }
     }
    }
}