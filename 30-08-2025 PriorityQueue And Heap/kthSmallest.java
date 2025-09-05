import java.util.*;
public class Main
{
    static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());//maxHeap
        for(int i = 0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
	public static void main(String[] args) {
		int[] arr = {7,10,4,3,20,15};
		int k = 3;
		System.out.println("Kth Smallest at position " + k +" : " + kthSmallest(arr,k));
		
	}
}
// tc = O(nlogk)
// sc = O(k)
