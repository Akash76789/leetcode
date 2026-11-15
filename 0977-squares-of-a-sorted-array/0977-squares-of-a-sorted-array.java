class Solution {
    public static void reverse(int[]arr){
     int n = arr.length;
    int i =0;
    int j = n-1;
    while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    }
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int p = 0;
        int q = 0;
        for(int i =0; i<n; i++){
            if(nums[i]>=0){
                p++;
            }
            else{
                q++;
            }
        }

        int [] positive = new int[p];
        int [] negative = new int[q];
        int s = 0; // traverse positive array 
        int t = 0; // traverse negative array 

        for(int i =0; i<n;i++){
            if(nums[i]>=0){
                positive[s]=nums[i];
                s++;
            }
            else{
                negative[t]=nums[i];
                t++;
            }
        }

        for(int i =0; i<p;i++){
            positive[i] = positive[i]*positive[i];
        }
        for(int i =0; i<q;i++){
            negative[i] = negative[i]*negative[i];
        }
        reverse(negative);

      int [] result = new int[p+q];

      int i = 0; // pointer for positive array 
      int j = 0; // pointer for negative array 
      int r = 0;  // pointer for final array 

      while(i<p && j<q){
        if(positive[i]<=negative[j]){
            result[r] = positive[i];
            i++;
            r++;
        }
        else{
            result[r] = negative[j];
            j++;
            r++;
        }
      }
        while(i<p){
        result[r]=positive[i];
        i++;
        r++;
      }
      while(j<q){
        result[r]=negative[j];
        j++;
        r++;
      }
      return result;
    


        


    }
}