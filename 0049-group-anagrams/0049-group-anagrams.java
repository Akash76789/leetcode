
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;

        // Stores sorted strings as keys and their anagram groups as values
        HashMap<String, List<String>> f = new HashMap<>();

        // Checks each string in the array
        for (int i = 0; i < n; i++) {

            // Converts the current string into a character array
            char[] ch = strs[i].toCharArray();

            // Sorts the characters of the current string
            // Example: "eat" becomes ['a', 'e', 't']
            Arrays.sort(ch);

            // Converts the sorted character array back into a string
            // This sorted string will be the key
            String key = new String(ch);

            // Checks whether this key is already present in the HashMap
            if (!f.containsKey(key)) {

                // If the key is new, create an empty list for this group
                f.put(key, new ArrayList<>());
            }

            // Gets the list for this key and adds the original string to it
            f.get(key).add(strs[i]);
        }

        // Returns all the anagram groups
        return new ArrayList<>(f.values());
    }
}

// Remember the logic
// - key stores the sorted version of a string.
// - f.get(key) retrieves the list for that anagram group.
// - .add(strs[i]) adds the original string to that group.
// Time complexity: \(O(n \times k\log k)\), where n is the number of strings and k is the maximum length of a string.
