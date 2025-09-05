import java.util.*;

public class KClosestElementsHeap {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int diff = Math.abs(b - x) - Math.abs(a - x);
            if (diff == 0) return b - a; // prefer smaller number
            return diff;
        });

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4, x = 3;

        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans); // Output: [1, 2, 3, 4]
    }
}
