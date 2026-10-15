class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start =0;
        int end = n-1;
        int ans = -1; // no index of peak element is found 

          // arr[mid+1] is target 
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                  ans = mid+1;
                  start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;

    }
}
