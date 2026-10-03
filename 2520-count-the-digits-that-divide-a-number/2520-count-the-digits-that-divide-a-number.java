class Solution {
    public int countDigits(int num) {
        int digitcount =0;
        int originalnum = num;
        while(num>0){
            int digit = num%10;
            if(originalnum % digit==0){
                digitcount++;
            }
            num= num/10;
        }
        return digitcount++;
    }
}