
import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();

        // Count the frequency of each character in text
        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Store the characters needed to make "balloon"
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2); // Two 'o' characters are required
        need.put('n', 1);

        // Find how many complete balloons each character allows
        int minimum = Integer.MAX_VALUE;

        for (char ch : need.keySet()) {
            int available = have.getOrDefault(ch, 0);
            int required = need.get(ch);

            // Calculate possible balloons for this character
            int count = available / required;

            // Keep the smallest count
            minimum = Math.min(minimum, count);
        }

        // Return the maximum number of complete balloons
        return minimum;
    }
}
