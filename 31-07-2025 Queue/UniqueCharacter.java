// leetcode 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // lowercase letters only

        // 1st pass: frequency count
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // 2nd pass: find first char with freq == 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no non-repeating character
    }
}
