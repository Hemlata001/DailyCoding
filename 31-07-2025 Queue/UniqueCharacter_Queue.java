// leetcode 387. First Unique Character in a String
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;

            if (freq[ch - 'a'] == 1) {
                q.add(i);
            }

            while (!q.isEmpty() && freq[s.charAt(q.peek()) - 'a'] > 1) {
                q.poll();
            }
        }

        return q.isEmpty() ? -1 : q.peek();
    }
}
