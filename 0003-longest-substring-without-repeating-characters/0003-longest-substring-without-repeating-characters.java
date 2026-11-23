
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0;
        int high = 0;
        int n = s.length();

        int maxlength = 0;

        HashMap<Character, Integer> f = new HashMap<>();

        while (high < n) {

            char ch = s.charAt(high);

            // Increase frequency of current character
            f.put(ch, f.getOrDefault(ch, 0) + 1);

            // Remove duplicate characters
            while (f.get(ch) > 1) {

                char left = s.charAt(low);

                // Decrease frequency of leftmost character
                f.put(left, f.get(left) - 1);

                // Move low forward
                low++;
            }

            // Calculate current window length
            int length = high - low + 1;

            // Update maximum length
            maxlength = Math.max(length, maxlength);

            // Move high forward
            high++;
        }

        return maxlength;
    }
}
