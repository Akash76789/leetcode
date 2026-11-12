class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();

        HashMap<Character,Integer>f = new HashMap<>();

        for(int i =0 ; i<n; i++){
            char ch = s.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);

        }

        int longest = 0;
        for(char ch : f.keySet()){
        int count = f.get(ch);
        longest = longest + count /2*2;
        }

        for(int value:f.values()){
            if(value%2!=0){
                return longest+1;
            }
        }
 return longest;
        }
       
    }
