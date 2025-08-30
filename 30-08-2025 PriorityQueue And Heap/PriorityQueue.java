
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(10);
        pq.add(7);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println("Head of Queue: " + pq.peek());
            pq.remove();
        }
        
    }
}
