
class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        // Handle empty array
        if(n == 0){
            return 0;
        }

        int i = 0;       // Tracks the last unique element
        int j = i + 1;   // Checks the next elements

        int unique = 1;  // First element is always unique

        while(j < n){

            // If current and next elements are equal, skip duplicate
            if(nums[i] == nums[j]){
                j++;
            }

            else{

                // Store the new unique element at the next position
                nums[i + 1] = nums[j];

                i++;       // Move to the next unique position
                j++;       // Move to the next element

                unique++;  // Increase unique count
            }
        }

        // Return total number of unique elements
        return unique;
    }
}
