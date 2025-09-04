import java.util.*;

public class ConnectRopes {
    public static int minCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // all ropes heap me daalo
        for (int rope : ropes) {
            pq.add(rope);
        }
        
        int cost = 0;
        
        // jab tak 2 se jyada ropes hain
        while (pq.size() > 1) {
            int first = pq.poll();   // sabse chhoti rope
            int second = pq.poll();  // doosri chhoti rope
            int sum = first + second;
            cost += sum;
            pq.add(sum); // nayi rope ko heap me daal do
        }
        
        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes = " + minCost(ropes));
    }
}
