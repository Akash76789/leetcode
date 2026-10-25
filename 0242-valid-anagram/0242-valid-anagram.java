class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if(m!=n){
            return false;
        }
        HashMap<Character,Integer>S = new HashMap<>();
        for(int i =0; i<m; i++){
            char ch = s.charAt(i);
            S.put(ch,S.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>T = new HashMap<>();
        for(int i =0; i<n; i++){
            char ch = t.charAt(i);
            T.put(ch,T.getOrDefault(ch,0)+1);
        }

     return S.equals(T);

    }
}