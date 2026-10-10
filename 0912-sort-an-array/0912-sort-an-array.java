class Solution {
    public static void merge(int [] nums , int l , int mid , int r){
        int n = nums.length;
        int n1 = mid-l+1;
        int n2 = r-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // copy element from left part to left array to get overall sorrted array from the both the half 

        for(int i =0; i<n1; i++){
            left[i] = nums[l+i];

        }
        // copy element from right part to right array to get overall sorrted array from the both the half
      for(int i =0; i<n2; i++){
        right[i] = nums[mid+1+i];
      }

      // find overall soretd array by comparing left and right array at each index in sorted rray minimum elment is always at start index 
      int i =0; // index to traverse the left array 
      int j =0; // index to traverse the right array 
      int k = l; // index to trvaerse the original array
      while(i<n1 && j <n2){
        if(left[i]<right[j]){
           nums[k++] = left[i++];
        }
        else{
            nums[k++] = right[j++];
        }
      }
      // if any index is out of bound or lemen of rrayis fulfil in final array but any array is still left to be insered 

      while(i<n1){
        nums[k++] = left[i++];
      }
      while(j<n2){
        nums[k++] = right[j++];
      }

    }
    
    public static void merge(int[]nums , int l , int r){
        int n = nums.length;
        // base case 
        if(l>=r){
            return;
        }
        // mid index 
        int mid = (l+r)/2;
        // recusrive work 
        merge(nums,l,mid);
        // recusrive work 
        merge(nums,mid+1, r);
        // self work
        merge(nums,l, mid , r);
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // l is starting index of left part 
        // r is ending index of right part
        merge(nums,0, n-1);
        return nums;
        
    }
}