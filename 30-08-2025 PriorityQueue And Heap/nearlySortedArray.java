class Solution{
static void nearlySorted(int[] arr, int k) {
    int n = arr.length;

    // Min Heap banayi (PriorityQueue by default min heap hoti hai)
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Step 1: First k elements heap me daalo
    for (int i = 0; i < k; i++) 
        pq.add(arr[i]);

    int i;
    // Step 2: Remaining elements process karo
    for (i = k; i < n; i++) {
        pq.add(arr[i]);          // ek naya element add kiya
        arr[i - k] = pq.poll();  // heap ka sabse chhota element correct position pe daal diya
    }

    // Step 3: Heap ke remaining elements nikal kar array me daal do
    while (!pq.isEmpty()) {
        arr[i - k] = pq.poll();
        i++;
    }
}
}
