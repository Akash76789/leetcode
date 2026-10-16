class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int start=0; // pointer pointing towars o index of an array 
        int end = n-1; // pointer pointing towards end or last index of an array 

        while(start<end){
            int mid = start + (end - start)/2;
            // increasing slope peak is on the right side 
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            // decraeasingh slope peak is at mid or on the left side
            else{
                end =mid;
            }
        }
        // when start and end pointer meet we are at peak index
        return start;
    }
}