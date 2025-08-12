// geeks for geeks
// Activity Selection
import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        if (n == 0) return 0;

        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int lastFinish = activities[0][1];

        for (int i = 1; i < n; i++) {
            // NOTE: use strict '>' if start==lastFinish should be considered overlapping
            if (activities[i][0] > lastFinish) {
                count++;
                lastFinish = activities[i][1];
            }
        }

        return count;
    }
}
