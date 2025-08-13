// geeks for geeks
// job sequencing problem
import java.util.*;

class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;

        // Step 1: Create job array [deadline, profit]
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }

        // Step 2: Sort by profit in descending order
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        // Step 3: Find maximum deadline to size slot array
        int maxDeadline = 0;
        for (int d : deadline) maxDeadline = Math.max(maxDeadline, d);

        // Step 4: Time slots (-1 means free)
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int countJobs = 0;
        int totalProfit = 0;

        // Step 5: Assign jobs to latest possible slot
        for (int[] job : jobs) {
            for (int t = job[0]; t > 0; t--) {
                if (slot[t] == -1) { // slot free
                    slot[t] = 1;
                    countJobs++;
                    totalProfit += job[1];
                    break;
                }
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(countJobs);
        res.add(totalProfit);
        return res;
    }
}
