class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> f = new HashMap<>();

        for(int i =0; i<n; i++){
            char[] ch = strs[i].toCharArray(); // 'e' 'a' 't'
             Arrays.sort(ch); // 'a' 'e' 't'

             String key = new String(ch);

             if(!f.containsKey(key)){
                f.put(key,new ArrayList<>());
             }

             f.get(key).add(strs[i]);

        }
        return new ArrayList<>(f.values());
    }
}