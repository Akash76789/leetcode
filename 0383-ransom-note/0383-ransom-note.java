class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = magazine.length(); // have
        int n = ransomNote.length(); // need 
        

        HashMap<Character,Integer> have = new HashMap<>();
        for(int i = 0; i<m; i++){
            char ch = magazine.charAt(i);

            have.put(ch,have.getOrDefault(ch,0)+1);
        }

         HashMap<Character,Integer> need = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = ransomNote.charAt(i);

            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        for(int i =0; i<n;i++){
            char ch = ransomNote.charAt(i);
            if(need.get(ch)>have.getOrDefault(ch,0)){
                return false;
            }

        }
return true;

    }
}