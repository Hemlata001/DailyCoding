// geeks for geeks Interleave the First Half of the Queue with Second Half
import java.util.*;

class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Queue length must be even");
        }

        int half = n / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: Store first half in another queue
        for (int i = 0; i < half; i++) {
            firstHalf.add(q.poll());
        }

        // Step 2: Interleave
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.poll()); // add from first half
            q.add(q.poll());         // add from second half
        }

        return q;
    }
}

