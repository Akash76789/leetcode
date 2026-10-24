
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();

        // Store each character and its frequency
        HashMap<Character, Integer> f = new HashMap<>();

        // First loop: Count the frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            // Get the current frequency (0 if absent), then add 1
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        // Second loop: Find the first character that appears once
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            // If frequency is 1, this character is unique
            if (f.get(ch) == 1) {
                return i; // Return its index
            }
        }

        // If no unique character exists, return -1
        return -1;
    }
}
