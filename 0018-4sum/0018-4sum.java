
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        int k = arr.length;

        Arrays.sort(arr); // Sort the array to apply two pointers

        // Fix the first element
        for(int i = 0; i < k-3; i++){

            if(i > 0 && arr[i] == arr[i-1]){
                continue; // Skip duplicate first elements
            }

            // Fix the second element
            for(int j = i+1; j < k-2; j++){

                if(j > i+1 && arr[j] == arr[j-1]){
                    continue; // Skip duplicate second elements
                }

                int m = j+1; // Left pointer
                int n = k-1; // Right pointer

                // Apply two-pointer approach
                while(m < n){

                    // Calculate the sum of four elements
                    long sum = (long) arr[i] + arr[j] + arr[m] + arr[n];

                    if(sum == target){

                        // Store the quadruplet in the answer list
                        ans.add(Arrays.asList(arr[i], arr[j], arr[m], arr[n]));

                        m++; // Move left pointer forward
                        n--; // Move right pointer backward

                        // Skip duplicate elements at m
                        while(m < n && arr[m] == arr[m-1]){
                            m++;
                        }

                        // Skip duplicate elements at n
                        while(m < n && arr[n] == arr[n+1]){
                            n--;
                        }
                    }

                    else if(sum < target){

                        m++; // Increase the sum by moving left pointer
                    }

                    else{

                        n--; // Decrease the sum by moving right pointer
                    }
                }
            }
        }

        return ans; // Return all unique quadruplets
    }
}
