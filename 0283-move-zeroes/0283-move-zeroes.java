
class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;

        int i = 0;       // Tracks the position of zero
        int j = i + 1;   // Checks the next elements

        while(j < n){

            // If both elements are zero, move j forward
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }

            // If i has zero and j has non-zero, swap them
            else if(nums[i] == 0 && nums[j] != 0){

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }

            // If i is non-zero, move both pointers
            else{
                i++;
                j++;
            }
        }
    }
}
