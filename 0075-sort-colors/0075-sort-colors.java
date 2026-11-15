
class Solution {
    public void sortColors(int[] arr) {

        int n = arr.length;

        int low = 0;       // Next position where 0 should be placed
        int mid = 0;       // Checks the current element (0, 1, or 2)
        int high = n - 1;  // Next position where 2 should be placed

        while (mid <= high) {

            if (arr[mid] == 0) {

                // Swap current element with the low position
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                // 0 is placed correctly, so move both pointers
                low++;
                mid++;

            }

            else if (arr[mid] == 2) {

                // Swap current element with the high position
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                // 2 is placed correctly, so move high backward
                // Do not move mid because the swapped element is unchecked
                high--;

            }

            else {

                // Current element is 1, already in the middle section
                // No swapping is required
                mid++;
            }
        }
    }
}
