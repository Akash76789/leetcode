class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       int n = words.length;
     StringBuilder result = new StringBuilder();
       for(int i =0; i<n; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            result.append(sb);
            if(i<n-1){
                result.append(" ");
            }
       }
       return result.toString();
    }
}