class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length();
        int n = ransomNote.length();
        HashMap<Character,Integer> f = new HashMap<>();

        for(int i =0; i<m;i++){
            char ch = magazine.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }

        for(int i =0; i<n;i++){
        char ch = ransomNote.charAt(i);
        if(f.getOrDefault(ch,0)==0){
            return false;
        }
        f.put(ch,f.get(ch)-1); 
    }
    return true;
}
}