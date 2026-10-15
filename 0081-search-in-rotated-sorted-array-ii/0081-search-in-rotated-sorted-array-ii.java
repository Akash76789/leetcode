
class Solution {

    public static boolean binarysearch(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            // Calculate middle index
            int mid = start + (end - start) / 2;

            // If target is found, return true
            if (nums[mid] == target) {
                return true;
            }

            // If all three values are equal, we cannot
            // determine which half is sorted
            if (nums[start] == nums[mid] &&
                nums[mid] == nums[end]) {

                start++;
                end--;
            }

            // Check whether the right half is sorted
            else if (nums[mid] <= nums[end]) {

                // Check whether target lies in the right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // Otherwise, the left half is sorted
            else {

                // Check whether target lies in the left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // Target was not found
        return false;
    }

    public boolean search(int[] nums, int target) {
        return binarysearch(nums, target);
    }
}
