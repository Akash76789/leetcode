class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character ,Integer > f = new HashMap<>();
        int n = s.length();
        int low = 0; // starting length of window 
        int high = 0; // end length of window 
        int maxlength = Integer.MIN_VALUE;
        while(high<n){
            char ch = s.charAt(high);
            f.put(ch,f.getOrDefault(ch,0)+1);
            while(f.get(ch)>1){
                char left = s.charAt(low);
                f.put(left,f.get(left)-1);
                low++;
            }
            int length = high - low +1;
            maxlength = Math.max(maxlength,length);
             high++;    
        }
        if(maxlength == Integer.MIN_VALUE){
            return 0;
        }
        return maxlength;

    }
}