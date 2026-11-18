class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i =0; 
        int j =n-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++; // remove special from left 

        }
           else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--; // remove speacial from right
                
        }
        else if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
            return false;
        }
        else{
            i++;
            j--;
        }
    }
    return true;
}
}