package BasicSorting;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // Remove characters until the duplicate is gone
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Test
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s)); // Output: 3
    }
}

