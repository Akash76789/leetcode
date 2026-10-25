import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> f = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        int longest = 0;

        // Iterate through all frequencies
        for (int freq : f.values()) {
            longest += (freq / 2) * 2;
        }

        // Check whether any frequency is odd
        for (int freq : f.values()) {
            if (freq % 2 != 0) {
                return longest + 1;
            }
        }

        return longest;
    }
}