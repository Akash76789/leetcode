class Solution {
    public static void merge (int [] nums , int start , int mid , int end){
        // find length of left array 
        int n1 = mid - start+1;
        int n2 = end - mid;

        // left array 

        int [] left = new int [n1];
        int [] right = new int [n2];

        for(int i= 0; i<n1; i++){
            left[i] = nums[start+i];
        }
        for(int i = 0; i<n2; i++){
        right[i] = nums[mid+1+i];
        }

        // copy elment of left and right array in final array in a sprte dway

    int i =0;
    int j = 0;
    int k  = start;

    while(i<n1 && j<n2 ){
       if(left[i]<right[j]){
        nums[k++] = left[i++];
       }
       else{
        nums[k++] = right[j++];
       }
    }
    while(i<n1){
        nums[k++] = left[i++];
    }
    while(j<n2){
        nums[k++] = right[j++];
    }
    }
    public static void mergeSort(int [] nums , int start , int end){
        // base case 
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        // recursive work 
        mergeSort(nums,start,mid);
        // recursive work 
        mergeSort(nums,mid+1,end);
        // self work 
        merge(nums,start, mid , end);
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        mergeSort(nums,start,end);
        return nums;

    }
}