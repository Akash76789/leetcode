class Solution {
    public void sortColors(int[] arr) {
      int n  = arr.length;
      int low = 0;
      int mid = 0;
      int high = n-1; 

      while(mid<=high){
        if(arr[mid] == 0){
            // swap[mid] && arr[low]
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            mid++;
            low++;

        }
        else if(arr[mid]==2){
            // swap arr[mid] && arr[high]
            int temp =arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }
        else{
            // arr[mid]==1
            mid++;
        }
      }
    }
}