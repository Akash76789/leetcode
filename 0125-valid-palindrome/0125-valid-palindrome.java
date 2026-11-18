class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();

        int i = 0;      // Starts from the left side
        int j = n - 1;  // Starts from the right side

        while (i < j) {

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Convert both characters to lowercase and compare them
            else if (Character.toLowerCase(s.charAt(i)) !=
                     Character.toLowerCase(s.charAt(j))) {

                // If both characters are different, return false
                return false;
            }

            else {

                // If both characters match, move both pointers
                i++;
                j--;
            }
        }

        // If all characters match, the string is a palindrome
        return true;
    }
}