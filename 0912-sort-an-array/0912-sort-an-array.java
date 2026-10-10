class Solution {
    // l is starting // left index 
    // r  is right index
    // mid index  
    
    public static void  merge ( int [] nums ,int l , int mid , int r){
        int n1 = mid - l +1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        // copy left part of array
        for(int i = 0; i<n1; i++){
            left[i] = nums[l+i];
        }
        // right part of array 
        for(int i = 0; i<n2;i++){
            right[i] = nums[mid+1+i];
        }

        // put both left part and right part of array in final array in asecnding order 
        int i =0;
        int j = 0;
        int k =l;

        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                nums[k++] = left[i++];
            }
            else{
            nums[k++] = right[j++];
            }
        }

        // left or right index i or j is out of bound 
         while(i<n1){
            nums[k++] = left[i++];

         }
         while(j<n2){
            nums[k++] = right[j++];
         }
    }

    public static void mergesort(int[] nums , int l , int r){
        int n = nums.length;
        // base case 
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        // recursive work 
        mergesort(nums,l, mid);
        // recursive work
        mergesort(nums,mid+1,r);
        // self work 
        merge(nums, l , mid , r);
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        mergesort(nums ,l , r);
    
        return nums;
        
        
    }
}
