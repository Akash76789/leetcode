class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
    HashMap<Character,Integer> f = new HashMap<>();

    for(int i =0; i<n; i++){
      char ch = s.charAt(i);
      f.put(ch,f.getOrDefault(ch,0)+1);
    }
    

int longest = 0;
for(char ch : f.keySet() ){
  longest += (f.get(ch)/2) *2;
}
for(char ch :f.keySet()) { 
if(f.get(ch)%2!=0){
 return longest+1;
}
}
return longest;
}
}