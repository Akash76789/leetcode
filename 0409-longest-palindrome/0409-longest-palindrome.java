class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> f = new HashMap<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        // longest = total even character sum + 1 odd 


        int longest = 0;

        for(int freq:f.values()){
            longest+= (freq/2)*2;

        }

        for(int freq: f.values()){
            if(freq%2!=0){
                return longest+1;
            }
        }
        return longest;
    }
}