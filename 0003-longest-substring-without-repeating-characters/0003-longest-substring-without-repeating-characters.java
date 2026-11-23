class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high = 0;
        int n = s.length();
        int maxlength = Integer.MIN_VALUE;
        HashMap<Character,Integer > f = new HashMap<>();
        while(high<n){
            char ch = s.charAt(high);
            f.put(ch,f.getOrDefault(ch,0)+1);

          while(f.get(ch)>1){
            char left = s.charAt(low); // character leaving window 
            f.put(left,f.get(left)-1);// Decrease its frequnecy
            low++; // move left pointer
          }

          int length = high - low +1;
          maxlength = Math.max(length,maxlength);
          high++;
        }
        if(maxlength == Integer.MIN_VALUE){
            return 0;
        }
        return maxlength;
        
    }
}