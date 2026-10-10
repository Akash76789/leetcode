class Solution {
    public static void merge(int[] nums , int l , int mid , int r){
        int n = nums.length;
        int n1 = mid-l+1;
        int n2 = r - mid; 

        // left array 
        // right array 
    int [] left = new int[n1];
    int [] right = new int[n2];
    // copy left elemnt in left array 
    for(int i =0; i<n1; i++){
        left[i] = nums[l+i];
    }
    // copy right element in right array 
for(int i =0; i<n2; i++){
    right[i] = nums[mid+1+i];
}

    int i = 0;
    int j = 0;
    int k = l;

while(i<n1 && j<n2){
    if(left[i]<right[j]){
      nums[k++] = left[i++];
    }
    else{
        nums[k++] = right[j++];
    }
}

// i or j is out boound and whole elment is not printed in array 

while(i<n1){
    nums[k++] = left[i++];
}
while(i<n2){
    nums[k++] = right[j++];
}

    }
    public static void mergesort(int[] nums , int l , int r){
        int n = nums.length;
        // base case 
        if(l>=r){
            return;
        }
        // find mid 
        int mid = (l+r) / 2;
        // recusrive work 
        mergesort(nums , l , mid );
        // recursive work 
        mergesort(nums, mid+1, r);
        // self work 
        merge(nums,l ,mid, r);
        
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // l is starting index of left half and r is ending of right half 
        

        mergesort(nums,0,n-1);
        return nums;
        
    }
}