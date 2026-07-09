class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int sum = 1;
        for( int i = 2; i*i<=num; i++){
            if(num%i==0){
                int firstfactor = i;
                int secondfactor = (num)/firstfactor;
                sum = sum+i;
                if(firstfactor != secondfactor){
                    sum = sum + secondfactor;
                }
            }
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }

    }
}