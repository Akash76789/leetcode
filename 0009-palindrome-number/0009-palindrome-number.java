class Solution {
    public static int reverse(int x , int ans){
        // base case 
        if(x<10){
            return ans*10+x;
        }
        int digit = x%10;
        ans = ans*10 + digit;
        return reverse(x/10 , ans);

    }

   public boolean isPalindrome(int x) {

    if(x<0){
        return false;
    }
    
    int finalans = reverse(x, 0);
    if(finalans == x){
        return true;
    }
    else{
        return false;
    }







//     int originalnum = x;
//    int reverse = 0;
//    while(x>0){
//     int digit = x%10;
//     reverse = reverse *10 + digit;
//     x = x/10;
//    }
//    int finalans = reverse;
//    if(originalnum==finalans){
//     return true;
//    }
//    else{
//     return false;
//    }


  
    }
}