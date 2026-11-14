class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;

        int left = 0;       // Points to the position where next 0 should go
        int right = n - 1;  // Points to the position where next 2 should go
        int mid = 0;        // Checks the current element

        while (mid <= right) {

            if (nums[mid] == 0) {

                // Swap 0 with the element at left
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                // 0 is placed correctly, so increase both pointers
                left++;
                mid++;
            }

            else if (nums[mid] == 1) {

                // 1 is already in the correct middle region
                mid++;
            }

            else {

                // Swap 2 with the element at right
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                // 2 is placed correctly, so decrease right
                // Do not increase mid because the swapped element is not checked yet
                right--;
            }
        }
    }
}