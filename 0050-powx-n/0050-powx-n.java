class Solution {
    public double myPow(double x, int n) {
        // base case 
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1 / myPow(x, -(n + 1)) / x;
        }
     
     // recursive work
    double smallans =  myPow(x , n/2);
    if(n%2==0){ // if n is even 
       return smallans * smallans;
    }
     else{
        return smallans * smallans * x;
     }
        
        
    }
}