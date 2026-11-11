class Solution {
    public boolean isAnagram(String s, String t) {
       int m = s.length();
       int n = t.length();
    if(m!=n){
    return false;
     }


    HashMap<Character,Integer> f = new HashMap<>();
    for(int i =0; i<m; i++){
    char ch = s.charAt(i);
    f.put(ch,f.getOrDefault(ch,0)+1);
    }

    HashMap<Character,Integer> g = new HashMap<>();
    for(int i =0; i<n; i++){
    char ch = t.charAt(i);
    g.put(ch,g.getOrDefault(ch,0)+1);
    }

  for(char ch : f.keySet()){
    if(!f.get(ch).equals(g.get(ch))){
        return false;
    }
    
  }
  return true;
    
    }
}