class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> f = new HashMap<>();
      int n = strs.length;
      for(int i =0; i<n;i++){
        char[] ch = strs[i].toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
      
      if(!f.containsKey(key)){
        f.put(key,new ArrayList<>());
      }
      f.get(key).add(strs[i]);
      }
      return new ArrayList<> (f.values());
    }
}