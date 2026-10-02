class Solution {
    public int fib(int n) {
        // base case 
        if(n==0|| n==1){
            return n;
        }
      
        // recursive work + self work
    return fib(n-1) + fib(n-2);
    }

}