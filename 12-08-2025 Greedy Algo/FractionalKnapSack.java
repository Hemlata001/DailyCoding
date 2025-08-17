// geeks for geeks
// Fractional Knapsack
import java.util.*;

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        double ratio[][] = new double[n][2]; // [index, value/weight]

        // store index and ratio
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }

        // sort by ratio in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        double finalVal = 0.0;

        // traverse from highest ratio to lowest
        for (int i = n - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weights[idx]) {
                // take full item
                finalVal += values[idx];
                capacity -= weights[idx];
            } else {
                // take fraction
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        return finalVal;
    }
}
